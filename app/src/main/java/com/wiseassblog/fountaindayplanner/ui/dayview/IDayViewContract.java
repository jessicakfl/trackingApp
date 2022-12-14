package com.wiseassblog.fountaindayplanner.ui.dayview;

import com.wiseassblog.fountaindayplanner.domain.Day;
import com.wiseassblog.fountaindayplanner.domain.Tasks;

public interface IDayViewContract {
    interface View {
        void setData(Day day, Tasks tasks);
        void navigateToHourView(int hourInteger);
        void navigateToTasksView();
        void showMessage(String message);
        void restartFeature();
    }

    interface ViewModel {
        void setDay(Day day);
        Day getDay();
        void setTasks(Tasks tasks);
        Tasks getTasks();
    }

}
