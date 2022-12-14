package com.wiseassblog.fountaindayplanner;

import com.wiseassblog.fountaindayplanner.domain.Day;
import com.wiseassblog.fountaindayplanner.domain.Hour;
import com.wiseassblog.fountaindayplanner.domain.QuarterHour;
import com.wiseassblog.fountaindayplanner.domain.Task;
import com.wiseassblog.fountaindayplanner.domain.Tasks;
import com.wiseassblog.fountaindayplanner.domain.constants.COLOR;
import com.wiseassblog.fountaindayplanner.domain.constants.HOUR_MODE;
import com.wiseassblog.fountaindayplanner.domain.constants.ICON;

import static com.wiseassblog.fountaindayplanner.domain.constants.ICON.WORK;
import static com.wiseassblog.fountaindayplanner.domain.constants.QUARTER.FIFTEEN;
import static com.wiseassblog.fountaindayplanner.domain.constants.QUARTER.FOURTY_FIVE;
import static com.wiseassblog.fountaindayplanner.domain.constants.QUARTER.THIRTY;
import static com.wiseassblog.fountaindayplanner.domain.constants.QUARTER.ZERO;

/**
 * Contains data use in various tests
 */
class TestData {

    static final int TASK_ID = 123456;
    static final String TASK_NAME = "Work";
    static final ICON TASK_ICON = WORK;
    static final COLOR TASK_COLOR = COLOR.DARK_BLUE;
    static final HOUR_MODE MODE = HOUR_MODE.TWELVE_HOUR;
    static final int HOUR_INTEGER = 12;



    static Tasks getTestTasks() {
        return new Tasks(
                new Task[]{
                        getTestTask(),
                        getTestTask(),
                        getTestTask()
                }
        );
    }

    static Task getTestTask() {
        return new Task(
                TASK_ID,
                TASK_NAME,
                TASK_ICON,
                TASK_COLOR
        );
    }

    static Day getTestDay() {
        return new Day(
                MODE,
                new Hour[]{
                        getTestHour(),
                        getTestHour(),
                        getTestHour(),
                        getTestHour(),
                        getTestHour(),
                        getTestHour(),
                        getTestHour(),
                        getTestHour(),
                        getTestHour(),
                        getTestHour(),
                        getTestHour(),
                        getTestHour(),
                        getTestHour(),
                        getTestHour(),
                        getTestHour(),
                        getTestHour(),
                        getTestHour(),
                        getTestHour(),
                        getTestHour(),
                        getTestHour(),
                        getTestHour(),
                        getTestHour(),
                        getTestHour(),
                        getTestHour()
                }
        );
    }

    static Hour getTestHour() {
        return new Hour(
                new QuarterHour[]{
                        getQuarterHour(),
                        new QuarterHour(
                                getQuarterHour().getTaskId(),
                                FIFTEEN,
                                false
                        ),
                        new QuarterHour(
                                getQuarterHour().getTaskId(),
                                THIRTY,
                                true
                        ),
                        new QuarterHour(
                                getQuarterHour().getTaskId(),
                                FOURTY_FIVE,
                                false
                        )
                },
                HOUR_INTEGER
        );
    }

    public static QuarterHour getQuarterHour() {
        return new QuarterHour(
                TASK_ID,
                ZERO,
                true
        );
    }
}
