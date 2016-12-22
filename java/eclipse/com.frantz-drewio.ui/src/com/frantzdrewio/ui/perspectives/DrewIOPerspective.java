package com.frantzdrewio.ui.perspectives;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;

import com.frantzdrewio.ui.views.DrewIOView;
import com.frantzdrewio.ui.views.SequenceView;


public class DrewIOPerspective implements IPerspectiveFactory {

	private IPageLayout layout;

	public DrewIOPerspective() {
		super();
	}

	public void createInitialLayout(IPageLayout factory) {
		this.layout = factory;
		addViews();
		addActionSets();
		addNewWizardShortcuts();
		addPerspectiveShortcuts();
		addViewShortcuts();
	}

	private void addViews() {
		// Creates the overall folder layout. 
		// Note that each new Folder uses a percentage of the remaining EditorArea.
		 String editorArea = layout.getEditorArea();
		 
	    IFolderLayout left = layout.createFolder("LEFT_EXPLORER", IPageLayout.LEFT, 0.2f, editorArea);
	    left.addView(IPageLayout.ID_PROJECT_EXPLORER);
	     
	    
	    IFolderLayout bottom = layout.createFolder("BOTTOM", IPageLayout.BOTTOM, 0.75f, editorArea);
        bottom.addView(IPageLayout.ID_PROP_SHEET);
        
        IFolderLayout bottomright = layout.createFolder("EXPLORER_BOTTOMRIGHT", IPageLayout.RIGHT, 0.40f, "BOTTOM");
        bottomright.addView(IPageLayout.ID_PROBLEM_VIEW);
        bottomright.addView(IConsoleConstants.ID_CONSOLE_VIEW);
        
        
       
        IFolderLayout outline = layout.createFolder("OUTLINE", IPageLayout.RIGHT, 0.8f, editorArea);
        outline.addView(DrewIOView.ID);
        outline.addView(SequenceView.ID);
		outline.addView(IPageLayout.ID_OUTLINE);
        outline.addPlaceholder("org.eclipse.help.ui.HelpView");
	    
        
	}

	private void addActionSets() {
		layout.addActionSet(IPageLayout.ID_NAVIGATE_ACTION_SET); //NON-NLS-1
	}

	private void addPerspectiveShortcuts() {
		layout.addPerspectiveShortcut("org.eclipse.ui.resourcePerspective"); //NON-NLS-1
	}

	private void addNewWizardShortcuts() {
		layout.addNewWizardShortcut("org.eclipse.team.cvs.ui.newProjectCheckout");//NON-NLS-1
		layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder");//NON-NLS-1
		layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.file");//NON-NLS-1
	}

	private void addViewShortcuts() {
		layout.addShowViewShortcut(DrewIOView.ID);
		
		layout.addShowViewShortcut(IConsoleConstants.ID_CONSOLE_VIEW);
		layout.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
		layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
		layout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
	}

}
