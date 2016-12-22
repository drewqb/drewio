package com.frantz.drewio.visual.editor.property;


import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.features.impl.AbstractFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import com.frantz.drewio.drewIO.DrewIOPackage;
import com.frantz.drewio.drewIO.InputStatement;

public class InputStatementSection extends GFPropertySection implements ITabbedPropertyConstants {

	private Text nameText;
	
	
	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);
		
		TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
		Composite composite = factory.createFlatFormComposite(parent);
		FormData data;

		nameText = factory.createText(composite, ""); //$NON-NLS-1$
		nameText.setEditable(true);
		data = new FormData();
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(0, VSPACE);
		nameText.setLayoutData(data);

		CLabel valueLabel = factory.createCLabel(composite, "Name:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(nameText, -HSPACE);
		data.top = new FormAttachment(nameText, 0, SWT.CENTER);
		valueLabel.setLayoutData(data);
	


		hookListeners();
	}
	
	InputStatement getInputStream()
	{
		PictogramElement pe = getSelectedPictogramElement();
		if(pe==null) return null;
		Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
		if (bo instanceof InputStatement)
		{
			return (InputStatement) bo;
		}
		return null;
	}
	void hookListeners()
	{
		hookListeners(nameText, DrewIOPackage.eINSTANCE.getStatement_Name());
		
	}
	void hookListeners(final Text theText, final EStructuralFeature theFeature)
	{
		
		theText.addModifyListener(new ModifyListener() 
		{

			@Override
			public void modifyText(ModifyEvent e) {
				String value = theText.getText();
				if (value == null) {
					value = "";//$NON-NLS-1$
				}
				final InputStatement theInputStream = getInputStream();
				if(theInputStream==null) return;
				
				String theValue = (String)theInputStream.eGet(theFeature);
				if (value.equals(theValue))
					return;
				final String typedValue = value;
				IFeature feature = new AbstractFeature(getDiagramTypeProvider().getFeatureProvider()) 
				{
						@Override
						public void execute(IContext context) 
						{
							theInputStream.eSet(theFeature, typedValue);
						}
						
						@Override
						public boolean canExecute(IContext context) {
							return true;
						}
					};
					CustomContext context = new CustomContext();
					execute(feature, context);
				}
		});

	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		// TODO Auto-generated method stub
		super.setInput(part, selection);
		
	}
	@Override
	public void refresh() {
		super.refresh();
		InputStatement theInputStream = getInputStream();
		if(theInputStream==null) return;
		
		String name = theInputStream.getName();
		nameText.setText(name == null ? "" : name); //$NON-NLS-1$

		
		
	}
}