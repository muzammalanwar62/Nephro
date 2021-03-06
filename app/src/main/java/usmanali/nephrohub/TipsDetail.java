package usmanali.nephrohub;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;

public class TipsDetail extends AppCompatActivity {
WebView description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_USER_PORTRAIT);
        setContentView(R.layout.activity_tips_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        description=(WebView) findViewById(R.id.desc);
        description.setVerticalScrollBarEnabled(true);
        description.setHorizontalScrollBarEnabled(true);
        description.loadUrl("file:///android_asset/"+getIntent().getStringExtra("file_name")+"/index.html");
    }

}
