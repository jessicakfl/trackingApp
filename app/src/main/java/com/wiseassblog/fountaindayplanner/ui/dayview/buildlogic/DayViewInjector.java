package com.wiseassblog.fountaindayplanner.ui.dayview.buildlogic;

import com.wiseassblog.fountaindayplanner.StorageServiceLocator;
import com.wiseassblog.fountaindayplanner.ui.dayview.DayView;
import com.wiseassblog.fountaindayplanner.ui.dayview.DayViewLogic;
import com.wiseassblog.fountaindayplanner.ui.dayview.DayViewModel;
import com.wiseassblog.fountaindayplanner.ui.dayview.IDayViewContract;

public class DayViewInjector {
    public static void build(
            DayView view,
            StorageServiceLocator locator
    ) {
        IDayViewContract.ViewModel vm = new DayViewModel();

        view.setLogic(
                new DayViewLogic(
                        view,
                        vm,
                        locator.getDayStorageImpl(),
                        locator.getTaskStorageImpl()
                )
        );
    }
}
