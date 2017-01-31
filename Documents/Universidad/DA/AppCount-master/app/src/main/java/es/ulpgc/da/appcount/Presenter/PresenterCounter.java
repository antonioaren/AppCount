package es.ulpgc.da.appcount.Presenter;


import android.view.View;

import es.ulpgc.da.appcount.Model.I_ModelCounter;
import es.ulpgc.da.appcount.Model.ModelCounter;
import es.ulpgc.da.appcount.View.I_ViewCounter;
import es.ulpgc.da.appcount.View.ViewCounter;

/**
 * Created by User on 29/01/2017.
 */

public class PresenterCounter implements I_PresenterCounter {

    private I_ModelCounter ModelCounter;
    private I_ViewCounter View;

    public PresenterCounter(I_ViewCounter v, ModelCounter m) {
        View = v;
        ModelCounter = m;
    }

    public I_ModelCounter getModelCounter() {
        return ModelCounter;
    }

    public void setModelCounter(I_ModelCounter modelCounter) {
        ModelCounter = modelCounter;
    }

    public I_ViewCounter getView() {
        return View;
    }

    public void setView(I_ViewCounter view) {
        View = view;
    }

    public void onStart(){

    }


    public void addButtonPressed() {

    }
}
