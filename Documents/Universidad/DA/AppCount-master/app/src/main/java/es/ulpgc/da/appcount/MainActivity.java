package es.ulpgc.da.appcount;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends Activity {
    private TextView display;
    private Button botonMas;
    private Button botonMenos;
    private Integer counter;


    class MyButtonListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {

            switch (view.getId()){
                case R.id.button1:
                    counter++;
                    break;
                case R.id.button2:
                    counter--;
                    break;
            }

            display.setText(counter.toString());
        }
    }

    // Esta actividad arranca ejecutando este metodo
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = 0;

        botonMas = (Button) findViewById(R.id.button1);
        botonMenos = (Button) findViewById(R.id.button2);
        display = (TextView) findViewById(R.id.display);

        botonMas.setOnClickListener(new MyButtonListener());
        botonMenos.setOnClickListener(new MyButtonListener());

    }
}
