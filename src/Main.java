/**
 * Created by LaroSelf on 02.04.2016.
 */
public class Main {
    public static void main(String[] args) {
  /*
    check ==

    Integer x1 = 10;
        Integer x2 = new Integer(10);
        Integer x4 = Integer.valueOf(10);
        Integer x5 = Integer.parseInt("10",10);
        System.out.println(x1==x2);
        System.out.println(x1==x4);
        System.out.println(x1==x5);
        System.out.println(x2==x4);
        System.out.println(x2==x5);
        System.out.println(x4==x5);
System.out.println();
        Integer y1 = 1020;
        Integer y2 = new Integer(1020);
        Integer y4 = Integer.valueOf(1020);
        Integer y5 = Integer.parseInt("1020",10);
        System.out.println(y1==y2);
        System.out.println(y1==y4);
        System.out.println(y1==y5);
        System.out.println(y2==y4);
        System.out.println(y2==y5);
        System.out.println(y4==y5); */

        // check .equals()
        Integer x1 = 10;
        Integer x2 = new Integer(10);
        Integer x4 = Integer.valueOf(10);
        Integer x5 = Integer.parseInt("10",10);
        System.out.println(x1.equals(x2));
        System.out.println(x1.equals(x4));
        System.out.println(x1.equals(x5));
        System.out.println(x2.equals(x4));
        System.out.println(x2.equals(x5));
        System.out.println(x4.equals(x5));
        System.out.println();
        Integer y1 = 1020;
        Integer y2 = new Integer(1020);
        Integer y4 = Integer.valueOf(1020);
        Integer y5 = Integer.parseInt("1020",10);
        System.out.println(y1.equals(y2));
        System.out.println(y1.equals(y4));
        System.out.println(y1.equals(y5));
        System.out.println(y2.equals(y4));
        System.out.println(y2.equals(y5));
        System.out.println(y4.equals(y5));

    }
}
