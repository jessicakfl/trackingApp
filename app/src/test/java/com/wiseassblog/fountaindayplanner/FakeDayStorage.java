package com.wiseassblog.fountaindayplanner;

import com.wiseassblog.fountaindayplanner.common.Continuation;
import com.wiseassblog.fountaindayplanner.domain.Day;
import com.wiseassblog.fountaindayplanner.domain.Hour;
import com.wiseassblog.fountaindayplanner.domain.IDayStorage;

import java.io.IOException;

class FakeDayStorage implements IDayStorage {

    private Boolean willFail = false;

    public void setWillFail(Boolean willFail) {
        this.willFail = willFail;
    }

    @Override
    public void getDay(Continuation<Day> continuation) {

        if (willFail) continuation.onException(new IOException());
        else continuation.onSuccess(TestData.getTestDay());
    }

    @Override
    public void updateDay(Day day, Continuation<Void> continuation) {
        if (willFail) continuation.onException(new IOException());
        else continuation.onSuccess(null);
    }

    @Override
    public void getHourWithMode(int hour, Continuation<Object[]> continuation) {
        Object[] results = new Object[2];
        results[0] = TestData.getTestHour();
        results[1] = TestData.MODE;
        continuation.onSuccess(
                results
        );
    }

    @Override
    public void updateHour(Hour hour, Continuation<Void> continuation) {
        if (willFail) continuation.onException(new IOException());
        else continuation.onSuccess(null);
    }
}
