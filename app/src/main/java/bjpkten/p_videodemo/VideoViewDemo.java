package bjpkten.p_videodemo;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoViewDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view_demo);


        final VideoView videoView = (VideoView) findViewById(R.id.video_view);

        //添加控制器
        videoView.setMediaController(new MediaController(this));

        //添加路径
        videoView.setVideoPath("http://qiubai-video.qiushibaike.com/91B2TEYP9D300XXH_3g.mp4");
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                videoView.start();
            }
        });

    }

}
