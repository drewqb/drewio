package com.frantz.drewio.visual.editor.diagram;


import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;

public class EditorDiagramTypeProvider extends AbstractDiagramTypeProvider 
	
	{

	public EditorDiagramTypeProvider() {
		super();
		setFeatureProvider(new EditorFeatureProvider(this));
	}
	@Override
	public boolean isAutoUpdateAtStartup() {
		return true;//super.isAutoUpdateAtStartup();
	}
	@Override
	public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
		// TODO Auto-generated method stub
		return new IToolBehaviorProvider[] {new ToolBehaviorProvider(this)};
	}

	
	
}
