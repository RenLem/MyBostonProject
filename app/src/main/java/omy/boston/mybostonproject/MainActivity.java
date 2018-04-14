package omy.boston.mybostonproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button firstB = (Button) findViewById(R.id.button2);
        Button secondB = (Button) findViewById(R.id.button3);
        final TextView tekst = (TextView) findViewById(R.id.textView7);

        firstB.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        tekst.setText(R.string.ajd_promjeni);
                    }
                }
        );

        secondB.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        tekst.setText(R.string.promjeni_me_natrag);
                    }
                }
        );

        firstB.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        tekst.setText("Krave daju mlijeko! ;)");
                        return true;
                    }
                }
        );

        secondB.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        tekst.setText("Svete mu krave, ovo je bilo dugo!!!");
                        return true;
                    }
                }
        );
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

