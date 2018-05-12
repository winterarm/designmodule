package winterarm.demo.design.behavior.observer.way1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangdx on 2018/5/6.
 */
public class ConcreteSubject implements Subject {

    List<Observer> observerList;

    private String state;

    public ConcreteSubject() {
        observerList = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observerList.indexOf(o) > 0) {
            observerList.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(o -> o.change(state));
    }

    public void stateChanged() {
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