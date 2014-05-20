package com.frantzdrewio.i18n;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "com.frantzdrewio.i18n.messages"; //$NON-NLS-1$

	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
	public static String TITLE;
	public static String OPEN_MODEL_MNU;
	public static String BUILD_MODEL_MNU;
	public static String LAYOUT_HORIZONTAL_MNU;
	public static String LAYOUT_VERTICAL_MNU;
	public static String RUN_SCRIPT_MNU;
	
}
