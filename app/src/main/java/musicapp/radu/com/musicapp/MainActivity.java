package musicapp.radu.com.musicapp;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        createListeners();


    }

    private void createListeners (){

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startSecondActivity(1);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startSecondActivity(2);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startSecondActivity(3);

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startSecondActivity(4);

            }
        });
    }

    private void startSecondActivity(int buttonNum) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("BUTTON NUMBER", buttonNum);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}
