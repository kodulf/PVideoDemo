package bjpkten.p_videodemo;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.io.IOException;

public class SurfaceViewMeadPlayerDemoActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surface_view_mead_player_demo);

        SurfaceView surfaceView = (SurfaceView) findViewById(R.id.surface_view);
        mediaPlayer = new MediaPlayer();

        try {
            mediaPlayer.setDataSource("http://qiubai-video.qiushibaike.com/91B2TEYP9D300XXH_3g.mp4");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //是在回调里面设置不是在这里设置
        //mediaPlayer.setDisplay(holder);

        SurfaceHolder holder = surfaceView.getHolder();
        holder.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(SurfaceHolder holder) {
                mediaPlayer.setDisplay(holder);
                mediaPlayer.prepareAsync();
            }

            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

            }

            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {
            }
        });

        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mediaPlayer.start();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mediaPlayer!=null){
            mediaPlayer.stop();
        }
    }
}
