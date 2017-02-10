package es.ulpgc.da.appcount.Screen1.Presenter;

import es.ulpgc.da.appcount.Mediator.Mediator;

/**
 * Created by User on 29/01/2017.
 */

public class PresenterCounter {


    private Mediator mediator;


    public PresenterCounter(Mediator m) {
        this.mediator = m;
    }

    public void addButtonPressed() {
        mediator.getModel().CountUp();
        setScreen();
    }
    public void lessButtonPressed(){
        mediator.getModel().CountDown();
        setScreen();
    }

    private void setScreen(){
        mediator.getView().Display(mediator.getModel().getCounter().toString());
    }
}
