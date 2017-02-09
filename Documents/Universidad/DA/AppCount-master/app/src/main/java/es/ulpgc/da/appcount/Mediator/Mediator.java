package es.ulpgc.da.appcount.Mediator;

import android.app.Application;

import es.ulpgc.da.appcount.Screen1.Model.ModelCounter;
import es.ulpgc.da.appcount.Screen1.Presenter.PresenterCounter;
import es.ulpgc.da.appcount.Screen1.View.ViewCounter;

/**
 * Created by antonioaren on 8/2/17.
 */

public class Mediator extends Application {

    private PresenterCounter presenter;
    private ModelCounter model;
    private ViewCounter view;

    @Override
    public void onCreate() {
        super.onCreate();

    }

    public PresenterCounter getPresenter() {
        if (presenter == null){
            presenter = new PresenterCounter(this);
        }
        return presenter;
    }

    public ModelCounter getModel() {
        //Lazyinstance
        if (model == null){
            model = new ModelCounter();
        }

        return model;
    }

    public ViewCounter getView() {

        return view;
    }

}
