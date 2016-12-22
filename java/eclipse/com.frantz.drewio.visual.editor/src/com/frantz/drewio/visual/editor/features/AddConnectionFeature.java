package com.frantz.drewio.visual.editor.features;

import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import com.frantz.drewio.drewIO.InputStatement;
import com.frantz.drewio.drewIO.OutputStatement;


public class AddConnectionFeature extends AbstractAddFeature implements
		IAddFeature {

	public AddConnectionFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		// TODO: check for right domain object instance below
		return context instanceof IAddConnectionContext /* && context.getNewObject() instanceof DomainObjectConnection */;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		IAddConnectionContext addConContext = (IAddConnectionContext) context;
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaService gaService = Graphiti.getGaService();

		Connection connection = peCreateService.createFreeFormConnection(getDiagram());
		connection.setStart(addConContext.getSourceAnchor());
		connection.setEnd(addConContext.getTargetAnchor());

		ConnectionDecorator cd = peCreateService.createConnectionDecorator(connection, false, 1.0,true);
		Object connectionHint = addConContext.getProperty("CREATE_CONNECTION_HINT");
		Object newObj = context.getNewObject();
		if(connectionHint instanceof InputStatement && newObj instanceof OutputStatement)
		{
			createFlow(cd);

			// flows we flip
			//connection.setStart(addConContext.getTargetAnchor());
		//	connection.setEnd(addConContext.getSourceAnchor());
			cd.setLocation(0);
		}
		
		Polyline polyline = gaService.createPlainPolyline(connection);
		polyline.setForeground(manageColor(IColorConstant.BLACK));

		// TODO: enable the link to the domain object
		// Object addedDomainObjectConnection = context.getNewObject();
		// link(connection, addedDomainObjectConnection);

		return connection;
	}
	Polyline createFlow(GraphicsAlgorithmContainer ga)
	{
		Polyline arrow = Graphiti.getGaCreateService().createPlainPolygon(ga, new int[]{-10,5,0,0,-10,-5,-10,5});
		// TODO arrow.setStyle
		arrow.setFilled(true);
		return arrow;
		
	}
	Polyline createSolidArrow(GraphicsAlgorithmContainer ga)
	{
		Polyline arrow = Graphiti.getGaCreateService().createPlainPolygon(ga, new int[]{-10,5,0,0,-10,-5,-10,5});
		// TODO arrow.setStyle
		arrow.setFilled(true);
		return arrow;
		
	}
	Polyline createDiamond(GraphicsAlgorithmContainer ga)
	{
		Polyline arrow = Graphiti.getGaCreateService().createPlainPolygon(ga, new int[]{-10,5,0,0,-10,-5,-20,0,-10,5});
		// TODO arrow.setStyle
		arrow.setFilled(true);
		return arrow;
		
	}
}
