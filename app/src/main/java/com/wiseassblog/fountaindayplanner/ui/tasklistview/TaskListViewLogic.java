package com.wiseassblog.fountaindayplanner.ui.tasklistview;

import com.wiseassblog.fountaindayplanner.common.BaseViewLogic;
import com.wiseassblog.fountaindayplanner.common.Continuation;
import com.wiseassblog.fountaindayplanner.domain.ITaskStorage;
import com.wiseassblog.fountaindayplanner.domain.Tasks;

public class TaskListViewLogic extends BaseViewLogic<TasksListViewEvent> {
    private final ITaskListViewContract.View view;
    private final ITaskListViewContract.ViewModel vm;
    private final ITaskStorage storage;

    public TaskListViewLogic(ITaskListViewContract.View view, ITaskListViewContract.ViewModel vm, ITaskStorage storage) {
        this.view = view;
        this.vm = vm;
        this.storage = storage;
    }


    @Override
    public void onViewEvent(TasksListViewEvent event) {
        switch (event.getEvent()) {
            case ON_START:
                onStart();
                break;
            case ON_LIST_ITEM_SELECTED:
                onItemSelected((int)event.getValue());
                break;
            case ON_BACK_PRESSED:
                onBackPressed();
                break;
        }
    }

    private void onBackPressed() {
        view.navigateToDayView();
    }

    private void onItemSelected(int position) {
        int id = vm.getTasks().get()[position].getTaskId();

        view.navigateToTaskView(id);
    }

    private void onDone() {

    }

    private void onStart() {
        storage.getTasks(
                new Continuation<Tasks>() {
                    @Override
                    public void onSuccess(Tasks result) {
                        vm.setTasks(result);
                        view.setTasks(result);
                    }

                    @Override
                    public void onException(Exception e) {
                        view.showMessage(e.getMessage());
                        view.navigateToDayView();
                    }
                }
        );
    }
}
