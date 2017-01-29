package es.ulpgc.da.appcount.Mediator;

import android.app.Application;

import es.ulpgc.da.appcount.Model.ModelCounter;
import es.ulpgc.da.appcount.Presenter.I_PresenterCounter;
import es.ulpgc.da.appcount.Presenter.PresenterCounter;
import es.ulpgc.da.appcount.View.I_ViewCounter;
import es.ulpgc.da.appcount.View.ViewCounter;

/**
 * Created by User on 29/01/2017.
 */

public class MediatorCounter extends Application implements I_MediatorCounter {
    public I_PresenterCounter getPresenterCounter(I_ViewCounter view){
        if (view instanceof ViewCounter){
            return new PresenterCounter(view, new ModelCounter());
        }
        return null;
    }

    public static MediatorCounter getInstance() {
        return null;
    }

    @Override
    public void setViewCounter(ViewCounter viewCounter) {
    }
}
