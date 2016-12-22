package com.frantz.drewio.visual.editor.diagram;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.impl.CreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.CreateContext;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.platform.IPlatformImageConstants;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.tb.ContextButtonEntry;
import org.eclipse.graphiti.tb.ContextEntryHelper;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IContextButtonEntry;
import org.eclipse.graphiti.tb.IContextButtonPadData;
import org.eclipse.graphiti.util.ILocationInfo;
import org.eclipse.graphiti.util.LocationInfo;
import org.eclipse.jface.viewers.ILabelProvider;

import com.frantz.drewio.drewIO.Column;
import com.frantz.drewio.drewIO.InputStatement;
import com.frantz.drewio.drewIO.Statement;
import com.frantz.drewio.visual.editor.ImageProvider;
import com.frantz.drewio.visual.editor.features.CreateColumnFeature;
import com.frantz.drewio.visual.editor.i18n.Messages;
import com.frantz.drewio.visual.editor.navigator.StudioLabelProvider;

public class ToolBehaviorProvider extends DefaultToolBehaviorProvider
{
	ILabelProvider myLabelPro = new StudioLabelProvider();
	public ToolBehaviorProvider(IDiagramTypeProvider fp)
	{
		super(fp);
	}
	
	@Override
	public String getContributorId() {
		return "com.frantz.drewio.visual.editor.PropertyContributor";
	}

	@Override
	public ILocationInfo getLocationInfo(PictogramElement pe,	ILocationInfo locationInfo) 
	{
		IFeatureProvider featureProvider = getFeatureProvider();
		Object bo = featureProvider.getBusinessObjectForPictogramElement(pe);
		if (bo instanceof Column) 
		{
			ContainerShape outerShape = (ContainerShape)locationInfo.getShape();
			Shape theText = outerShape.getChildren().get(0);
			//Shape theText = locationInfo.getShape();;
			
			LocationInfo li = new LocationInfo(theText,theText.getGraphicsAlgorithm());
			return li;
		}
		return super.getLocationInfo(pe, locationInfo);
	}

	@Override
	public GraphicsAlgorithm[] getClickArea(PictogramElement pe) {
		IFeatureProvider featureProvider = getFeatureProvider();
		Object bo = featureProvider.getBusinessObjectForPictogramElement(pe);
		if (bo instanceof Statement) {
			GraphicsAlgorithm invisible = pe.getGraphicsAlgorithm();
			GraphicsAlgorithm rectangle = invisible.getGraphicsAlgorithmChildren().get(0);
			return new GraphicsAlgorithm[] { rectangle };
		}
		return super.getClickArea(pe);
	}
	@Override
	public GraphicsAlgorithm getSelectionBorder(PictogramElement pe) {
		if (pe instanceof ContainerShape) {
			GraphicsAlgorithm invisible = pe.getGraphicsAlgorithm();
			if (!invisible.getLineVisible()) {
				EList<GraphicsAlgorithm> graphicsAlgorithmChildren = invisible.getGraphicsAlgorithmChildren();
				if (!graphicsAlgorithmChildren.isEmpty()) {
					return graphicsAlgorithmChildren.get(0);
				}
			}
		}
		return super.getSelectionBorder(pe);
	}
	@Override
	public Object getToolTip(GraphicsAlgorithm ga) {
		PictogramElement pe = ga.getPictogramElement();
		Object bo = getFeatureProvider().getBusinessObjectForPictogramElement(pe);
		if (bo instanceof EObject) 
		{
		
			String name = myLabelPro.getText(bo);
			
			if (name != null && !(name.length() == 0)) {
				return name;
			}
		}
		return super.getToolTip(ga);
	}
	@Override
	public IContextButtonPadData getContextButtonPad(IPictogramElementContext context) {
		IContextButtonPadData data = super.getContextButtonPad(context);
		PictogramElement pe = context.getPictogramElement();
		Object bo = getFeatureProvider().getBusinessObjectForPictogramElement(pe);
		if(!(bo instanceof Statement))
		{
			return null;
		}
		//setGenericContextButtons(data, pe, CONTEXT_BUTTON_DELETE | CONTEXT_BUTTON_UPDATE | CONTEXT_BUTTON_REMOVE);
		setGenericContextButtons(data, pe, CONTEXT_BUTTON_DELETE | CONTEXT_BUTTON_REMOVE);

		CustomContext cc = new CustomContext(new PictogramElement[] { pe });
		ICustomFeature[] cf = getFeatureProvider().getCustomFeatures(cc);
		for (int i = 0; i < cf.length; i++) 
		{
			ICustomFeature iCustomFeature = cf[i];
			IContextButtonEntry collapseButton = ContextEntryHelper.createCollapseContextButton(true, iCustomFeature, cc);
			data.setCollapseContextButton(collapseButton);
		}

		CreateConnectionContext ccc = new CreateConnectionContext();
		ccc.setSourcePictogramElement(pe);
		Anchor anchor = null;
		if (pe instanceof Anchor) {
			anchor = (Anchor) pe;
		} else if (pe instanceof AnchorContainer) {
			// assume, that our shapes always have chopbox anchors
			anchor = Graphiti.getPeService().getChopboxAnchor((AnchorContainer) pe);
		}
		ccc.setSourceAnchor(anchor);

		ContextButtonEntry button = new ContextButtonEntry(null, context);
		button.setText(Messages.CREATE_CONN);
		button.setIconId(IPlatformImageConstants.IMG_ECLIPSE_WARNING_TSK);//TutorialImageProvider.IMG_EREFERENCE);
		ICreateConnectionFeature[] features = getFeatureProvider().getCreateConnectionFeatures();
		for (ICreateConnectionFeature feature : features) {
			if (feature.isAvailable(ccc) && feature.canStartConnection(ccc))
				button.addDragAndDropFeature(feature);
		}

		if (button.getDragAndDropFeatures().size() > 0) 
		{
			data.getDomainSpecificContextButtons().add(button);
		}

		// domain buttons for varrious palette entries
		if(bo instanceof InputStatement)
		{
			CreateColumnFeature ccf = new CreateColumnFeature(getFeatureProvider());
			CreateContext newCC = new CreateContext();
			newCC.putProperty("PARENT", (InputStatement)bo);
			newCC.setTargetContainer((ContainerShape) pe);
			ContextButtonEntry addColumn = new ContextButtonEntry(ccf, newCC);
			addColumn.setText(Messages.CREATE_COLUMN);
			addColumn.setIconId(ImageProvider.COLUMN);
			
			data.getGenericContextButtons().add(addColumn);
		}
		return data;
	}
}
