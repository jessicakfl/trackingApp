package com.wiseassblog.fountaindayplanner;

import android.content.Context;

import com.wiseassblog.fountaindayplanner.domain.IDayStorage;
import com.wiseassblog.fountaindayplanner.domain.ITaskStorage;
import com.wiseassblog.fountaindayplanner.persistence.LocalDayStorageImpl;
import com.wiseassblog.fountaindayplanner.persistence.LocalTaskStorageImpl;

public class StorageServiceLocator {

    private final IDayStorage dayStorageImpl;
    private final ITaskStorage taskStorageImpl;

    /**
     * Why toString? By passing the String instead of context, I can keep the Android code out of
     * my backend components. This class inevitably must interact with Context, so I can work with
     * it here.
     * @param context
     */
    public StorageServiceLocator(Context context) {
        ApplicationExecutors exec = new ApplicationExecutors();

        dayStorageImpl = new LocalDayStorageImpl(
                context.getFilesDir().getPath(),
                exec
        );
        taskStorageImpl = new LocalTaskStorageImpl(
                context.getFilesDir().getPath(),
                exec
        );
    }

    public IDayStorage getDayStorageImpl() {
        return dayStorageImpl;
    }

    public ITaskStorage getTaskStorageImpl() {
        return taskStorageImpl;
    }
}
