package es.ulpgc.da.appcount.Presenter;

import es.ulpgc.da.appcount.Model.ModelCounter;
import es.ulpgc.da.appcount.View.ViewCounter;

/**
 * Created by User on 29/01/2017.
 */

public class PresenterCounter {

    private ModelCounter Model;
    private ViewCounter View;


    public PresenterCounter() {
        Model = new ModelCounter();
        View = new ViewCounter();
    }

    public void addButtonPressed() {
        Model.CountUp();
        View.Display(Model.getCounter().toString());
    }

}
