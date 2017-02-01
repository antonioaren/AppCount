package es.ulpgc.da.appcount.View;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import es.ulpgc.da.appcount.Presenter.I_PresenterCounter;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonMas = (Button) findViewById(R.id.button1);
        botonMenos = (Button) findViewById(R.id.button2);

        display = (TextView) findViewById(R.id.display);

        presenter = new PresenterCounter(this);


        botonMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.addButtonPressed();
            }
        });
    }

    public void Display(int numero){
        display.setText(Integer.toString(numero));
    }

}
