package es.ulpgc.da.appcount.Screen1.View;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import es.ulpgc.da.appcount.Mediator.Mediator;
import es.ulpgc.da.appcount.Screen1.Presenter.PresenterCounter;
import es.ulpgc.da.appcount.R;

/**
 * Created by User on 29/01/2017.
 */

public class ViewCounter extends Activity{

    private TextView display;
    private Button botonMas;
    private Button botonMenos;
    private Mediator mediator;
    //private PresenterCounter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //presenter = new PresenterCounter(this);

        botonMas = (Button) findViewById(R.id.button1);
        botonMenos = (Button) findViewById(R.id.button2);

        display = (TextView) findViewById(R.id.display);

        botonMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediator.getPresenter().addButtonPressed();
            }
        });
        botonMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediator.getPresenter().lessButtonPressed();
            }
        });
    }



    public void Display(String text){
        display.setText(text);
    }

}
