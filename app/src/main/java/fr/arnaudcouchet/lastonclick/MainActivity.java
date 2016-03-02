package fr.arnaudcouchet.lastonclick;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtonOnClick(View v) {
        int buttonId = v.getId();
        switch (buttonId) {
            case R.id.hide:
                changeText("hide");
                break;
            case R.id.sendRocket:
                changeText("sendRocket");
                break;
        }
    }

    private void changeText(String text) {
        TextView t =(TextView)findViewById(R.id.myAwesomeTextView);
        t.setText(text);
    }
}
