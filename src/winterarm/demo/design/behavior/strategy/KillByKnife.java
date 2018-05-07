package winterarm.demo.design.behavior.strategy;

/**
 * Created by huangdx on 2018/5/6.
 */
public class KillByKnife implements Behavior {

    @Override
    public void doSomething() {
        System.out.println("I killed a man by a knife.");
    }
}
