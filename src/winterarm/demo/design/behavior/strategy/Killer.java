package winterarm.demo.design.behavior.strategy;

/**
 * Created by huangdx on 2018/5/6.
 */
public class Killer extends Character {

    public Killer(){
        behavior = new KillByKnife();
    }
}
