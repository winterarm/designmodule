package winterarm.demo.design.behavior.observer.way1;

/**
 * Created by huangdx on 2018/5/6.
 */
public class Main {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer = new ConcreteObserver(subject);
        subject.setState("1");
        subject.setState("2");
        subject.setState("3");
    }
}
