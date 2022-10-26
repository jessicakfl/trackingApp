package com.wiseassblog.fountaindayplanner.ui.managetaskview;

import com.wiseassblog.fountaindayplanner.domain.Task;
import com.wiseassblog.fountaindayplanner.domain.constants.COLOR;
import com.wiseassblog.fountaindayplanner.domain.constants.ICON;

public interface ITaskViewContract {
    interface View {
        void showColorPickerSheet();
        void hideColorPickerSheet();
        void setName(String name);
        String getName();
        void setIconSelection(ICON icon);
        void setSelectedSpinnerItem(int position);
        void setButtonColor(COLOR c);
        void goToTaskListActivity();
        void showMessage(String message);
    }

    interface ViewModel {
        void setTask(Task task);
        Task getTask();
    }
}
