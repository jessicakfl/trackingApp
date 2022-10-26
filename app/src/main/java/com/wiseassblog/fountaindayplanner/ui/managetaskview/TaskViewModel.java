package com.wiseassblog.fountaindayplanner.ui.managetaskview;

import com.wiseassblog.fountaindayplanner.domain.Task;

/**
 * A data store (cache) for front end session data
 */
public class TaskViewModel implements ITaskViewContract.ViewModel {
    private Task task;

    @Override
    public void setTask(Task task) {
        this.task = task;
    }

    @Override
    public Task getTask() {
        return this.task;
    }
}
