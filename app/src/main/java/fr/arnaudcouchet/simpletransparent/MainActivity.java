package fr.arnaudcouchet.simpletransparent;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    // 1. Android stuff
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button btn1 = (Button) findViewById(R.id.button);
//        btn1.setOnClickListener(btnListener);
    }

    // 2. Events
//    private View.OnClickListener btnListener = new View.OnClickListener() {
//        public void onClick(View v) {
//            int i = 1;
//        }
//    };

    public void backup(View view) {
        System.out.println("backup");
    }
}
