package winterarm.demo.design.behavior.observer.way1;

/**
 * Created by huangdx on 2018/5/6.
 */
public class ConcreteObserver implements Observer {

    private Subject subject;

    private String state;

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void change(String state) {
        System.out.println("state is changed from " + this.state + " to " + state);
        this.state = state;
    }
}