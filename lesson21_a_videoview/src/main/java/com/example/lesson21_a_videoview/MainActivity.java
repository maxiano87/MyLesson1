package com.example.lesson21_a_videoview;


import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    VideoView videoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*videoPlayer = (VideoView) findViewById(R.id.videoPlayer);
        Uri myVideoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sample);
        videoPlayer.setVideoURI(myVideoUri);*/

        //////
        videoPlayer =  (VideoView)findViewById(R.id.videoPlayer);
        MediaController mediaController = new MediaController(this);
        videoPlayer.setMediaController(mediaController);
        mediaController.setMediaPlayer(videoPlayer);
        videoPlayer.setVideoPath("http://video.ch9.ms/ch9/507d/71f4ef0f-3b81-4d2c-956f-c56c81f9507d/AndroidEmulatorWithMacEmulator.mp4");
        //videoPlayer.setVideoPath("https://r1---sn-xaj5u-4g0l.googlevideo.com/videoplayback?expire=1582652537&ei=GAhVXur2Oc7oyQW3rb_YDA&ip=2a00%3Af940%3A2%3A1%3A2%3A%3A2496&id=o-AHq3yMXR-NpVJOPL8DObOl7zhTgWKN2cmO5waRebHyrM&source=youtube&requiressl=yes&pcm2=yes&vprv=1&mime=video%2Fmp4&ratebypass=yes&dur=1156.469&lmt=1572096560077159&fvip=6&fexp=23842630&c=WEB&txp=5432432&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cpcm2%2Cvprv%2Cmime%2Cratebypass%2Cdur%2Clmt&sig=ALgxI2wwRQIhAIwUf-1Knw5Z6jUY-d-sQCJCItid1-lwQSqRvnNLfZkwAiAP5_Vd-pAnZ9lzbc1aLVf9QopNjdg1i46LjTaOv7tz-Q%3D%3D&itag=22&cms_redirect=yes&mip=185.54.253.233&mm=31&mn=sn-xaj5u-4g0l&ms=au&mt=1582630892&mv=m&mvi=0&pl=24&lsparams=mip,mm,mn,ms,mv,mvi,pl&lsig=ABSNjpQwRAIgbVLv_z3Xa-8U95pLet1jRBlOit4rRq65ZmgkdsihEnoCICcUyT0Jk-pqYIfTm_fJHW8N9Q7FLOaE36X_BLaCm-vF");
        //videoPlayer.setVideoPath("gs://lombard-9aaa1.appspot.com/Hourglass.mp4");
    }

    public void play(View view) {
        videoPlayer.start();
    }

    public void pause(View view) {
        videoPlayer.pause();
    }

    public void stop(View view) {
        videoPlayer.stopPlayback();
        videoPlayer.resume();
    }
}