package com.wiseassblog.fountaindayplanner.common;

public interface Continuation<T> {
    public void onSuccess(T result);

    public void onException(Exception e);
}
