package drewio_swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class DScrolled {

	static int m_cnt=0;
	public static void main (String [] args) 
	{
	    Display display = new Display ();
	    Shell shell = new Shell (display);
	    shell.setLayout(new FillLayout());

	    final ScrolledComposite myScrolled = new ScrolledComposite(shell, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		myScrolled.setLayout(new FillLayout());
		myScrolled.setExpandVertical(true);
		
		final Composite myComposite = new Composite(myScrolled, SWT.NONE);
		myComposite.setLayout(new GridLayout(1,true));	
		
	    
	    Button b1 = new Button(myComposite, SWT.PUSH);
	    b1.setText("Add Button");
	    
	    b1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e)
			{  
				Button b = new Button(myComposite, SWT.PUSH);
				b.setText("New Button" + (++m_cnt));
				resizeScrolled(myComposite, myScrolled);
			}
		});
	    
	    myScrolled.addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(ControlEvent e) {

				resizeScrolled(myComposite, myScrolled);
			}
		});
	    myScrolled.setContent(myComposite);
	    shell.setSize(600, 300);
	    shell.open ();
	    while (!shell.isDisposed ()) {
	        if (!display.readAndDispatch ()) display.sleep ();
	    }
	    display.dispose ();
	}
	static void resizeScrolled(Composite myComposite, ScrolledComposite sc)
	{
	    Point p1 = myComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT);
	    myComposite.setSize(p1);
	    sc.setMinSize(p1);
	    sc.layout();
	}
}
