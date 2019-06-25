package com.example.lifecycleawareness;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MyActivityObserver implements LifecycleObserver {
    private String TAG = this.getClass().getSimpleName();

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void OnCreateEvent()
    {
        Log.e(TAG, "OnCreateEvent");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void OnDestoryEvent() {   Log.e(TAG, "OnCreateEvent"); }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void OnPauseEvent()
    {
        Log.e(TAG, "OnPauseEvent");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void OnResumeEvent()
    {
        Log.e(TAG, "OnResumeEvent");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void OnStartEvent()
    {
        Log.e(TAG, "OnStartEvent");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void OnStopEvent()
    {
        Log.e(TAG, "OnStopEvent");
    }
}
