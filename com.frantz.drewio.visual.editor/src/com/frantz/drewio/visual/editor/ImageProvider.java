package com.frantz.drewio.visual.editor;


import org.eclipse.graphiti.ui.platform.AbstractImageProvider;
import org.eclipse.swt.graphics.Image;

public class ImageProvider extends AbstractImageProvider {

	protected static final String PREFIX = "com.frantz.drewio.visual.editor.ImageProvider.";
	public static final String INPUT_ST = PREFIX + "INPUT_ST";
	public static final String OUTPUT_ST = PREFIX + "OUTPUT_ST";
	public static final String COLUMN = PREFIX + "COLUMN";
	
	public static final String INPUT_ST_PNG = PREFIX + "INPUT_ST_PNG";
	public static final String OUTPUT_ST_PNG = PREFIX + "OUTPUT_ST_PNG";
	
	
	@Override
	protected void addAvailableImages() {
		// TODO Auto-generated method stub
		addImageFilePath(INPUT_ST, "icons/tool16/input_st.gif");
		addImageFilePath(OUTPUT_ST, "icons/tool16/output_st.gif");
		addImageFilePath(COLUMN, "icons/tool16/column.gif");
		
		addImageFilePath(INPUT_ST_PNG, "icons/png/input_st.png");
		addImageFilePath(OUTPUT_ST_PNG, "icons/png/output_st.png");
		
	}

}
