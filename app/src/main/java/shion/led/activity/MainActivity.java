package shion.led.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

import shion.led.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WindowManager.LayoutParams lp = getWindow().getAttributes();
        lp.screenBrightness = 200f;
        getWindow().setAttributes(lp);
    }
}
