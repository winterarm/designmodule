package winterarm.demo.design;

/**
 * Created by huangdx on 2017/10/20.
 */
public class test {

    public static void main(String[] args){
        String a = "abcd";
        String b = "abcd";
        System.out.println(a == b);
        System.out.println(a.equals(b));

        String c = new String("abcd");
        String d = new String("abcd");
        System.out.println(c == d);
        System.out.println(c.equals(d));
    }
}
