package elnemr.com.phase1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import elnemr.com.phase1.Adapters.IMageAdapter;



public class MainActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        int [] images = {R.drawable.poster1, R.drawable.poster2, R.drawable.poster3, R.drawable.poster4
        ,R.drawable.poster1, R.drawable.poster2, R.drawable.poster3, R.drawable.poster4};

        List<row> theRow = new ArrayList<row>();

        IMageAdapter imageAdapter = new IMageAdapter(getApplicationContext(), R.id.gridview,theRow);

        for (int i = 0; i < images.length; i++) {
            row row = new row(images[i]);
            theRow.add(row);

        }
        gridView = (GridView)findViewById(R.id.gridview);
        gridView.setAdapter(imageAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void imageClick(View view) {

        int id = view.getId();
        switch (id)
        {
            case R.drawable.poster1:
                break;
        }


    }
}
