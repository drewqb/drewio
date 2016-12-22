var swtNames = JavaImporter();
swtNames.importPackage(Packages.org.eclipse.swt);
swtNames.importPackage(Packages.org.eclipse.swt.widgets);
swtNames.importPackage(Packages.org.eclipse.swt.layout);
swtNames.importPackage(Packages.org.eclipse.swt.graphics);
swtNames.importPackage(Packages.org.eclipse.swt.events);
swtNames.importPackage(Packages.org.eclipse.jface.dialogs);

var toggle = false;


function newButton(type) {
	with(swtNames) {
		obj = new Button(composite, eval(type));
		obj.setText(type);
		return obj;
	}
}

function newFillLayout() {
	with(swtNames) {
		obj = new FillLayout();
		return obj;
	}
} 
function newLabel(img, text) {
	with(swtNames) {
		obj = new Label(composite, SWT.NONE);
		if(img != null) obj.setImage(img);
		if(text != null) obj.setText(text);
		obj;
	}
}
 
function newItem(num, text) {
with(swtNames) {
	obj = new ExpandItem (bar, SWT.NONE, num);
	obj.setText(text);
	obj.setHeight(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
	obj.setControl(composite);
	}
	return obj;
}

function createComponets(dialog) { 

with(swtNames) {
	dialog.setLayout(newFillLayout()); 
	bar = new ExpandBar (dialog, SWT.V_SCROLL);		
	// First item
	
	composite = new Composite (bar, SWT.NONE);
	layout = new GridLayout ();
	layout.marginLeft = layout.marginTop = layout.marginRight = layout.marginBottom = 10;
	layout.verticalSpacing = 10;
	composite.setLayout(layout);
	 
	newButton("SWT.PUSH");
	newButton("SWT.RADIO");
	newButton("SWT.CHECK");
	button = newButton("SWT.TOGGLE");
	button.setText("This is a toggle1");
	button.addSelectionListener(function(event, methodName) {
			if (methodName == "widgetSelected") 
			{     
				toggle ? button.setText("This is a toggle1") : button.setText("This is a toggle2");
				out.println("Doing a toggle");
				toggle=!toggle;
			}
		});
	
	
	newItem(0, "What is your favorite button");
		
	// Second item
	composite = new Composite (bar, SWT.NONE);
	layout = new GridLayout (2, false);
	layout.marginLeft = layout.marginTop = layout.marginRight = layout.marginBottom = 10;
	layout.verticalSpacing = 10;
	composite.setLayout(layout);
	 
	newLabel(display.getSystemImage(SWT.ICON_ERROR), null);
	newLabel(null, "SWT.ICON_ERROR");
	newLabel(display.getSystemImage(SWT.ICON_INFORMATION), null);
	newLabel(null, "SWT.ICON_INFORMATION");
	newLabel(display.getSystemImage(SWT.ICON_WARNING), null);
	newLabel(null, "SWT.ICON_WARNING");
	newLabel(display.getSystemImage(SWT.ICON_QUESTION), null);
	newLabel(null, "SWT.ICON_QUESTION");
	newItem(1, "What is your favorite icon").setExpanded(true);
			
	// Third item
	composite = new Composite (bar, SWT.NONE);
	layout = new GridLayout (2, true);
	layout.marginLeft = layout.marginTop = layout.marginRight = layout.marginBottom = 10;
	layout.verticalSpacing = 10;
	composite.setLayout(layout);
	newLabel(null, "Scale");
	new Scale (composite, SWT.NONE);
	newLabel(null, "Spinner");	
	new Spinner (composite, SWT.BORDER);
	newLabel(null, "Slider");	
	new Slider (composite, SWT.NONE);
	newItem(2, "What is your favorite range widget");
	 
	bar.setSpacing(8);
	}
}

with(swtNames)
{
	dialog = new Shell (shell, SWT.DIALOG_TRIM);
	createComponets(dialog);
		
	dialog.open();	
}