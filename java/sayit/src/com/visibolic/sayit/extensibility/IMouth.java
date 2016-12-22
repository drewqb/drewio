package com.visibolic.sayit.extensibility;

import android.graphics.drawable.AnimationDrawable;
import android.text.Editable;

public interface IMouth {
	int getResting();
	AnimationDrawable parseAnimation(Editable e);
}
