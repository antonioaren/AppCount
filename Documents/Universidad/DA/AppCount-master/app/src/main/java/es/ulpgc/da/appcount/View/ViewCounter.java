package es.ulpgc.da.appcount.View;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import es.ulpgc.da.appcount.Mediator.MediatorCounter;
import es.ulpgc.da.appcount.Presenter.PresenterCounter;
import es.ulpgc.da.appcount.R;

/**
 * Created by User on 29/01/2017.
 */

public class ViewCounter extends Activity implements I_ViewCounter, android.view.View.OnClickListener {

    private TextView display;
    private Button botonMas;
    private Button botonMenos;
    private MediatorCounter mediator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediator = MediatorCounter.getInstance();
        mediator.setViewCounter(this);

        botonMas = (Button) findViewById(R.id.button1);
        botonMenos = (Button) findViewById(R.id.button2);
        display = (TextView) findViewById(R.id.display);

        botonMas.setOnClickListener(this);
        botonMenos.setOnClickListener(this);

    }

    @Override
    public void onClick(android.view.View view) {
        switch (view.getId()){
            case R.id.button1:
                PresenterCounter.addButtonPressed();
                break;
            case R.id.button2:

                break;
        }
    }

    @Override
    public void Contador(int number){
        this.display.setText(Integer.toString(number));
    }
}
