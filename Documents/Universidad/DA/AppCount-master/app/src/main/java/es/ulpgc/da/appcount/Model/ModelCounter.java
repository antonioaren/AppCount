package es.ulpgc.da.appcount.Model;

/**
 * Created by User on 29/01/2017.
 */

public class ModelCounter implements I_ModelCounter {

    private int counter;

    public ModelCounter(){
        counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void CountUp(){
        counter++;
    }

    public void CountDown(){
        counter--;
    }

}
