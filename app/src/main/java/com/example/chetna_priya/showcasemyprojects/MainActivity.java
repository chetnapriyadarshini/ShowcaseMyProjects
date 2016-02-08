package com.example.chetna_priya.showcasemyprojects;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
      return true;
    }

    private void makeText(String s) {
        if(toast != null)
            toast.cancel();
        toast = Toast.makeText(this,s,Toast.LENGTH_LONG);
        ViewGroup group = (ViewGroup) toast.getView();
        TextView messageTextView = (TextView) group.getChildAt(0);
        messageTextView.setTextSize(25);
        toast.show();
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

    public void OnClick(View view) {
        switch(view.getId())
        {
            case R.id.btn_spotify:
                makeText("This button will launch my spotify app!");
                break;
            case R.id.btn_scores:
                makeText("This button will launch my scores app!");
                break;
            case R.id.btn_library:
                makeText("This button will launch my library app!");
                break;
            case R.id.btn_build_bigger:
                makeText("This button will launch my build bigger app!");
                break;
            case R.id.btn_xyz_reader:
                makeText("This button will launch my xyz reader app!");
                break;
            case R.id.btn_capstone:
                makeText("This button will launch my capstone app!");
                break;
        }
    }
}
