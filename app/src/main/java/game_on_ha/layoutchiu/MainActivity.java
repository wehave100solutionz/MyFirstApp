package game_on_ha.layoutchiu;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);



    }


    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    public void toggleDesc(View v) {

        if (view==null)
        {
            view = ((ViewStub) findViewById(R.id.desc)).inflate();
        }
        boolean visible = (view.getVisibility()==View.VISIBLE);
        view.setVisibility(visible ? View.GONE : View.VISIBLE);
    }
}
