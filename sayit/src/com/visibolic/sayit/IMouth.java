package com.visibolic.sayit;

import android.graphics.drawable.AnimationDrawable;
import android.text.Editable;

public interface IMouth {
	int getResting();
	AnimationDrawable parseAnimation(Editable e);
}
