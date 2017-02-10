package es.ulpgc.da.appcount.Screen1.Model;

import es.ulpgc.da.appcount.Mediator.Mediator;

/**
 * Created by User on 29/01/2017.
 */

public class ModelCounter implements I_ModelCounter {

    private Integer counter;
    private Mediator m;

    public ModelCounter(Mediator mediator){
        this.m = mediator;

        counter = 0;
    }

    public Integer getCounter() {
        return counter;
    }

    public void CountUp(){
        counter++;
    }

    public void CountDown(){
        counter--;
    }

}
