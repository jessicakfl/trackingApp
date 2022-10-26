package com.wiseassblog.fountaindayplanner.domain;

import com.wiseassblog.fountaindayplanner.common.Continuation;

public interface ITaskStorage {
    public void getTasks(Continuation<Tasks> continuation);

    public void getTask(int taskId, Continuation<Task> continuation);

    public void updateTask(Task task, Continuation<Void> continuation);
}
