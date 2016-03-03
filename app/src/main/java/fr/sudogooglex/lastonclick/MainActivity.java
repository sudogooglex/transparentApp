package fr.sudogooglex.lastonclick;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    public static String hide = "hide", send = "sendRocket";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Pass touch events to the background activity
//        getWindow().addFlags(
//                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
//                        | WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL
//                        | WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

        setContentView(R.layout.activity_main);
    }

    public void ButtonOnClick(View v) {
        int buttonId = v.getId();
        switch (buttonId) {
            case R.id.hide:
                changeText(hide);
                break;
            case R.id.sendRocket:
                changeText(send);
                break;
        }
    }

    private void changeText(String text) {
        TextView t = (TextView) findViewById(R.id.myAwesomeTextView);
        t.setText(text);
    }
}
