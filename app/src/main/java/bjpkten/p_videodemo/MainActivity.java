package bjpkten.p_videodemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 使用videoview的时候要注意，在模拟器上面会报错："can't play this video"
     * @param view
     */
    public void useVideoView(View view) {
        Intent intent = new Intent(this,VideoViewDemo.class);
        startActivity(intent);
    }

    /**
     *
     * @param view
     */
    public void useVitami(View view) {
        Intent intent = new Intent(this,VitamiDemoActivity.class);
        startActivity(intent);
    }

    public void useSurfaceView(View view) {
        Intent intent = new Intent(this,SurfaceViewMeadPlayerDemoActivity.class);
        startActivity(intent);
    }
}
