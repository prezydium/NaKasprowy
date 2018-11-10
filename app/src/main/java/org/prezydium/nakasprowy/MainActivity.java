package org.prezydium.nakasprowy;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer toastOneMediaPlayer;
    private MediaPlayer toastTwoMediaPlayer;
    private MediaPlayer toastThreeMediaPlayer;
    private MediaPlayer toastFourMediaPlayer;
    private TextView countDisplay;
    private long toastCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toastOneMediaPlayer = MediaPlayer.create(this, R.raw.toast1);
        toastTwoMediaPlayer = MediaPlayer.create(this, R.raw.toast2);
        toastThreeMediaPlayer = MediaPlayer.create(this, R.raw.toast3);
        toastFourMediaPlayer = MediaPlayer.create(this, R.raw.toast4);
        countDisplay = findViewById(R.id.countDisplay);
    }

    public void playToast(View view) {
        switch (view.getId()) {
            case R.id.btn_toast1:
                toastOneMediaPlayer.start();
                break;
            case R.id.btn_toast2:
                toastTwoMediaPlayer.start();
                break;
            case R.id.btn_toast3:
                toastThreeMediaPlayer.start();
                break;
            case R.id.btn_toast4:
                toastFourMediaPlayer.start();
                break;
        }
        updateCountView();
    }

    private void updateCountView() {
        toastCount++;
        countDisplay.setText(String.valueOf(toastCount));
    }
}
