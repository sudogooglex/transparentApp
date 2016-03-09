package fr.sudogooglex.lastonclick;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends Activity {

    public static String hide = "hide", send = "sendRocket";

    private PostAPI postApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        postApi = new PostAPI();

        setContentView(R.layout.activity_main);
    }

    public void ButtonOnClick(View v) {
        int buttonId = v.getId();
        switch (buttonId) {
            case R.id.hide:
                changeText(hide);
                enableEvents();
                break;
            case R.id.sendRocket:
                changeText(send);
                postSampleData();
                break;
        }
    }

    /**
     * Post data for testing purpose.
     */
    private void postSampleData() {
        String url = "http://localhost:8080/SR/wr/optimized/";
        HashMap<String, String> map = new HashMap<>();
        map.put("moves", "g1f3 g8f6");
        map.put("hashValue", "256");
        map.put("threadsValue", "1");
        map.put("movetime", "100");
        map.put("forsythEdwardsNotation", "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1");
        map.put("timeWaitUpdateEvaluationScore", "100");

        new PostAPI().execute(url, map);
//        System.out.println(res);
    }

    private void changeText(String text) {
        TextView t = (TextView) findViewById(R.id.myAwesomeTextView);
        t.setText(text);
    }

    /**
     * Pass touch events to the background activity
     */
    private void enableEvents() {
        getWindow().addFlags(
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
                        | WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL
                        | WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
    }
}
