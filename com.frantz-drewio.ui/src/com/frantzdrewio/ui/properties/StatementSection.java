package com.frantzdrewio.ui.properties;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import com.frantz.drewio.drewIO.DrewIOPackage;
import com.frantz.drewio.drewIO.Statement;

public class StatementSection extends AbstractPropertySection {

	private Text nameText;

	public StatementSection() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);
		
		TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
		Composite composite = factory.createFlatFormComposite(parent);
		composite.setLayout(new GridLayout(2, false));
		
		createCLabel(composite, DrewIOPackage.eINSTANCE.getStatement_Name().getName());
		nameText = factory.createText(composite, ""); //$NON-NLS-1$
		nameText.setEditable(false);
		nameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		
		
		
	}
	@Override
	public void refresh() {
		super.refresh();
		//listenersOff();
		updateUIControls();
		//listenersOn();
		
	}
	
	protected EObject getSemantic()
	{
		ISelection sel = this.getSelection();
		if(sel instanceof StructuredSelection)
		{
			StructuredSelection ss = (StructuredSelection)sel;
			Object o = ss.getFirstElement();
			
			if(o instanceof EObject)
			{
				return ((EObject)o);
			}
		}
		return null;
	}
	protected CLabel createCLabel(Composite composite, String str)
	{
		TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
		return factory.createCLabel(composite, str);
	}
	protected void updateUIControls() {
		
		Statement theType = (Statement)getSemantic();
		if(theType==null) return;

		String name = theType.getName();
		nameText.setText(name == null ? "" : name); //$NON-NLS-1$

	}

}
