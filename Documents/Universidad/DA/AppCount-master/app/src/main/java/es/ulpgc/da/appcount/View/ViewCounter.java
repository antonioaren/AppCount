package es.ulpgc.da.appcount.View;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import es.ulpgc.da.appcount.Presenter.PresenterCounter;
import es.ulpgc.da.appcount.R;

/**
 * Created by User on 29/01/2017.
 */

public class ViewCounter extends Activity{

    private TextView display;
    private Button botonMas;
    private Button botonMenos;
    private PresenterCounter presenter;


    class MyButtonListener implements View.OnClickListener{


        @Override
        public void onClick(View view) {

            switch (view.getId()){
                   case R.id.button1:
                       presenter.addButtonPressed();
                       break;
                   case R.id.button2:
                       presenter.addButtonPressed();
                       break;
               }
        }


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new PresenterCounter();

        botonMas = (Button) findViewById(R.id.button1);
        botonMenos = (Button) findViewById(R.id.button2);

        display = (TextView) findViewById(R.id.display);

        botonMas.setOnClickListener(new MyButtonListener());
        botonMenos.setOnClickListener(new MyButtonListener());
    }



    public void Display(String text){
        display.setText(text);
    }

}
