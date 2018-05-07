package winterarm.demo.design.behavior.observer.way2;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by huangdx on 2018/5/6.
 */
public class ConcreteObserver implements Observer {

    private Observable observable;

    private String state;

    public ConcreteObserver(Observable o){
        this.observable = o;
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof ConcreteSubject){
            ConcreteSubject subject = (ConcreteSubject) o;
            System.out.println("state is changed from " + this.state + " to " + subject.getState());
            this.state = subject.getState();
        }
    }
}