package com.wiseassblog.fountaindayplanner.ui.dayview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.wiseassblog.fountaindayplanner.R;
import com.wiseassblog.fountaindayplanner.FountainApp;
import com.wiseassblog.fountaindayplanner.ui.dayview.buildlogic.DayViewInjector;

//Feature level container
public class DayActivity extends AppCompatActivity {

    private static final String DAY_VIEW = "DAY_VIEW";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);

        DayView fragment = (DayView) this.getSupportFragmentManager().findFragmentByTag(
                DAY_VIEW
        );

        if (fragment == null) {
         fragment = DayView.newInstance();
        }

        this.getSupportFragmentManager().beginTransaction().replace(
                R.id.root_day_view,
                fragment,
                DAY_VIEW
        ).commit();

        DayViewInjector.build(fragment, ((FountainApp) getApplication()).getServiceLocator());
    }
}