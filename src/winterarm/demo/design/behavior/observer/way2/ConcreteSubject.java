package winterarm.demo.design.behavior.observer.way2;

import java.util.Observable;

/**
 * Created by huangdx on 2018/5/6.
 */
public class ConcreteSubject extends Observable {

    private String state;

    public void stateChanged(){
        setChanged();
        notifyObservers();
    }

    public void setState(String state) {
        this.state = state;
        stateChanged();
    }

    public String getState() {
        return this.state;
    }

}