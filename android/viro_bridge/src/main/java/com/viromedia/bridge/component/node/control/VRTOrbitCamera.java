/**
 * Copyright © 2016 Viro Media. All rights reserved.
 */
package com.viromedia.bridge.component.node.control;


import com.facebook.react.bridge.ReactContext;
import com.viro.core.Camera;
import com.viro.core.Vector;

public class VRTOrbitCamera extends VRTCamera {
    private float[] mFocalPoint;

    public VRTOrbitCamera(ReactContext context) {
        super(context);
    }

    @Override
    public Camera.RotationType getRotationType() {
        return Camera.RotationType.ORBIT;
    }

    public void setFocalPoint(float[] focalPoint) {
        mFocalPoint = focalPoint;
    }

    public float[] getFocalPoint() {
        return mFocalPoint;
    }

    @Override
    public void onPropsSet() {
        super.onPropsSet();
        mNativeCamera.setOrbitFocalPoint(new Vector(mFocalPoint));
    }
}