package com.wiseassblog.fountaindayplanner.ui.managehourview.buildlogic;

import com.wiseassblog.fountaindayplanner.StorageServiceLocator;
import com.wiseassblog.fountaindayplanner.domain.Hour;
import com.wiseassblog.fountaindayplanner.ui.managehourview.HourView;
import com.wiseassblog.fountaindayplanner.ui.managehourview.HourViewLogic;
import com.wiseassblog.fountaindayplanner.ui.managehourview.HourViewModel;
import com.wiseassblog.fountaindayplanner.ui.managehourview.IHourContract;

public class HourViewInjector {
    public static void build(
            int hourInt,
            HourView view,
            StorageServiceLocator locator
    ) {
        IHourContract.ViewModel vm = new HourViewModel();
        vm.setHour(
                new Hour(
                        null,
                        hourInt
                )
        );

        view.setLogic(
                new HourViewLogic(
                        view,
                        vm,
                        locator.getDayStorageImpl(),
                        locator.getTaskStorageImpl()
                )
        );
    }
}
