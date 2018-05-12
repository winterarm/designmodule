package winterarm.demo.design.behavior.observer.way1;

import java.util.List;

/**
 * Created by huangdx on 2018/5/6.
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
