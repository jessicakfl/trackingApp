package com.wiseassblog.fountaindayplanner.common;

/**
 * Base class for ViewLogic classes, which are similar in nature to Presenters or Controllers.
 *
 *
 *
 * @param <T> Expected to be a ViewEvent class for a given feature. This pattern helps to organize
 *           communication between the View and the ViewLogic, and gives the ViewLogic class a
 *           single primary entry point to test most of its methods.
 *
 */
public abstract class BaseViewLogic<T> {

    private boolean isCancelled = false;

    /**
     * If the View indicates that it is to be destroyed, we want to inform the Logic class
     * so that it can avoid calling back to a null fragment/activity.
     */
    public void onCancel(){
        isCancelled = true;
    }

    public abstract void onViewEvent(T event);
}
