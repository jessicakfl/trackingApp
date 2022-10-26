package com.wiseassblog.fountaindayplanner.ui.tasklistview.buildlogic;

import com.wiseassblog.fountaindayplanner.StorageServiceLocator;
import com.wiseassblog.fountaindayplanner.ui.tasklistview.ITaskListViewContract;
import com.wiseassblog.fountaindayplanner.ui.tasklistview.TaskListView;
import com.wiseassblog.fountaindayplanner.ui.tasklistview.TaskListViewLogic;
import com.wiseassblog.fountaindayplanner.ui.tasklistview.TaskListViewModel;

public class TaskListViewInjector {
    public static void build(
            TaskListView view,
            StorageServiceLocator locator
    ) {

        ITaskListViewContract.ViewModel vm = new TaskListViewModel();

        view.setLogic(
                new TaskListViewLogic(
                        view,
                        vm,
                        locator.getTaskStorageImpl()
                )
        );
    }
}
