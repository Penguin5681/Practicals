package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class LuckyActivity extends AppCompatActivity {
    String videoUrl = "https://www.youtube.com/shorts/7fTHD07Q9Pw";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucky);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.the_huh_cat;

        VideoView videoView = findViewById(R.id.video_view);
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);

        videoView.setMediaController(mediaController);

        videoView.start();

        Button btn = findViewById(R.id.return_btn);
        btn.setOnClickListener(v -> {
            Intent intent = new Intent(LuckyActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}