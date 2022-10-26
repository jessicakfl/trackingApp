package com.wiseassblog.fountaindayplanner.ui.managehourview;

import com.wiseassblog.fountaindayplanner.domain.Hour;
import com.wiseassblog.fountaindayplanner.domain.Tasks;
import com.wiseassblog.fountaindayplanner.domain.constants.QUARTER;

public interface IHourContract {
    interface View {
       void setQuarterHourText(QUARTER quarter, String hour);
       void setQuarterHourAdapterData(QUARTER quarter, String[] taskNames, int startingPosition);
       void setQuarterHourActive(QUARTER quarter, boolean isActive);
       void setListeners();
       void navigateToDayView();
       void showMessage(String message);
       void setQuarterHour(QUARTER q);
    }

    interface ViewModel {
        void setHour(Hour hour);
        Hour getHour();
        void setTaskList(Tasks tasks);
        Tasks getTasks();
    }
}
