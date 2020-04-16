package vn.edu.ntu.ngoquoctrung_59132881_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Date;
import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity {
    TextView textTG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textTG = findViewById(R.id.textTG);
        SimpleDateFormat spf = new SimpleDateFormat("HH:mm:ss");
        String strDate = spf.format(new Date());
        textTG.setText(strDate);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","onRestart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","onDestroy called");
    }
}
