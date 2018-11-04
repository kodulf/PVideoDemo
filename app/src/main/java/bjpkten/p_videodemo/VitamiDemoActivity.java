package bjpkten.p_videodemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.vov.vitamio.Vitamio;
import io.vov.vitamio.widget.MediaController;
import io.vov.vitamio.widget.VideoView;

public class VitamiDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitami_demo);

        //一定要初始化
        Vitamio.initialize(this);

        final VideoView videoView = (VideoView)findViewById(R.id.video_view_vitamio);
        videoView.setVideoPath("http://qiubai-video.qiushibaike.com/91B2TEYP9D300XXH_3g.mp4");
        videoView.setMediaController(new MediaController(this));
        videoView.start();

    }
}
