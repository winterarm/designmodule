package winterarm.demo.design.behavior.strategy;

/**
 * Created by huangdx on 2018/5/6.
 */
public abstract class Character {

    Behavior behavior;

    public void doWhatICanDo(){
        behavior.doSomething();
    }

}
