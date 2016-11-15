package com.achillesl.micard;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private final String PACKAGE_NAME = "com.miui.tsmclient";
    private final String Activity_NAME = PACKAGE_NAME + ".ui.quick.DoubleClickActivity";
    private final String ACTION = "com.miui.intent.action.DOUBLE_CLICK";
    private final int FLAG = 0x10800000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ComponentName componentName = new ComponentName(PACKAGE_NAME, Activity_NAME);

        Intent intent = new Intent();
        intent.setAction(ACTION);
        intent.setFlags(FLAG);
        intent.setComponent(componentName);
        intent.putExtra("event_source", "key_volume_down");

        startActivity(intent);
        finish();
    }
}
