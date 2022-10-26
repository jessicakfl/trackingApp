package com.wiseassblog.fountaindayplanner.ui.managehourview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.wiseassblog.fountaindayplanner.R;
import com.wiseassblog.fountaindayplanner.FountainApp;
import com.wiseassblog.fountaindayplanner.domain.constants.Extras;
import com.wiseassblog.fountaindayplanner.ui.dayview.DayActivity;
import com.wiseassblog.fountaindayplanner.ui.managehourview.buildlogic.HourViewInjector;

import static com.wiseassblog.fountaindayplanner.common.Messages.GENERIC_ERROR_MESSAGE;

public class HourActivity extends AppCompatActivity {

    private static final String HOUR_VIEW = "HOUR_VIEW";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_hour);

        final Intent i = this.getIntent();

        if (i == null) {
            Toast.makeText(this,
                    GENERIC_ERROR_MESSAGE,
                    Toast.LENGTH_SHORT
            ).show();

            startActivity(
                    new Intent(this, DayActivity.class)
            );
        }

        int hourInteger = i.getIntExtra(
                Extras.EXTRA_HOUR_INTEGER,
                0
        );

        HourView fragment = (HourView) this.getSupportFragmentManager().findFragmentByTag(
                HOUR_VIEW
        );

        if (fragment == null) {
            fragment = HourView.newInstance();
        }

        this.getSupportFragmentManager().beginTransaction().replace(
                R.id.root_manage_hour_view,
                fragment,
                HOUR_VIEW
        ).commit();


        HourViewInjector.build(
                hourInteger,
                fragment,
                ((FountainApp) getApplication()).getServiceLocator()
        );
    }
}