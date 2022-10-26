package com.wiseassblog.fountaindayplanner.ui.managetaskview.buildlogic;

import com.wiseassblog.fountaindayplanner.StorageServiceLocator;
import com.wiseassblog.fountaindayplanner.domain.Task;
import com.wiseassblog.fountaindayplanner.domain.constants.COLOR;
import com.wiseassblog.fountaindayplanner.domain.constants.ICON;
import com.wiseassblog.fountaindayplanner.ui.managetaskview.ITaskViewContract;
import com.wiseassblog.fountaindayplanner.ui.managetaskview.TaskView;
import com.wiseassblog.fountaindayplanner.ui.managetaskview.TaskViewLogic;
import com.wiseassblog.fountaindayplanner.ui.managetaskview.TaskViewModel;

public class TaskViewInjector {
    public static void build(
            TaskView view,
            StorageServiceLocator locator,
            int taskId
    ) {

        ITaskViewContract.ViewModel vm = new TaskViewModel();

        vm.setTask(
                new Task(
                     taskId,
                     "",
                     ICON.BREAK,
                     COLOR.DARK_BLUE
                )
        );

        view.setLogic(
                new TaskViewLogic(
                        (ITaskViewContract.View) view,
                        vm,
                        locator.getTaskStorageImpl()
                )
        );
    }
}
