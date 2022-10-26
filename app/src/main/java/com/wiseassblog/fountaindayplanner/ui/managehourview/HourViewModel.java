package com.wiseassblog.fountaindayplanner.ui.managehourview;

import com.wiseassblog.fountaindayplanner.domain.Hour;
import com.wiseassblog.fountaindayplanner.domain.Tasks;

public class HourViewModel implements IHourContract.ViewModel {
    private Hour hour;
    private Tasks tasks;

    @Override
    public void setHour(Hour hour) {
        this.hour = hour;
    }

    @Override
    public Hour getHour() {
        return this.hour;
    }

    @Override
    public void setTaskList(Tasks tasks) {
        this.tasks = tasks;
    }

    @Override
    public Tasks getTasks() {
        return this.tasks;
    }
}
