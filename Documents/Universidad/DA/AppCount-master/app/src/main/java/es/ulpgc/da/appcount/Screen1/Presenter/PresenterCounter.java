package es.ulpgc.da.appcount.Screen1.Presenter;

import es.ulpgc.da.appcount.Mediator.Mediator;
import es.ulpgc.da.appcount.Screen1.Model.ModelCounter;
import es.ulpgc.da.appcount.Screen1.View.ViewCounter;

/**
 * Created by User on 29/01/2017.
 */

public class PresenterCounter {


    private Mediator mediator;


    public PresenterCounter(Mediator m) {
        this.mediator = m;
        //mediator.registerReceiver(getView());
    }

    public void addButtonPressed() {
        mediator.getModel().CountUp();
        setSceen();
        //mediator.getView().Display(mediator.getModel().getCounter().toString());
    }
    public void lessButtonPressed(){
        mediator.getModel().CountDown();
        setSceen();
        //mediator.getView().Display(mediator.getModel().getCounter().toString());
    }

    private void setSceen(){
        mediator.getView().Display(mediator.getModel().getCounter().toString());
    }
}
