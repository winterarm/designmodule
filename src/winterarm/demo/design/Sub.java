package winterarm.demo.design;

import java.util.Arrays;
import java.util.List;

/**
 * Created by huangdx on 2017/10/20.
 */
public class Sub{

    public static void main(String[] args){
        Integer a = 1000, b = 1000;
        System.out.println(a == b);
        Integer c = 100, d = 100;
        System.out.println(c == d);
        String[] ss = "1,2,3,4,5,6".split(",");
        List list = Arrays.asList(ss);
        list.contains("1");
    }

}
