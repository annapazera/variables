package it.motfoza.java101;

/**
 * Created by Anna Kacprzak on 2016-07-27.
 */
public class Variables {
    static byte b1;
    static short s1;
    static int i1;
    static long l1;
    static char c1 = 253;
    static float f1;
    static double d1;
    static Object o1;
    static boolean bool;

    public static void main(String[] args) {

        System.out.println(b1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);
        System.out.println(c1);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(o1);
        System.out.println(bool);

        byte b2 = 0;
        if (b1 == b2) {
            System.out.println("OK");
        } else {
            System.out.println(" ;( ");
        }
        short s2 = 0;
        if (s1 == s2) {
            System.out.println("OK");
        } else {
            System.out.println(" ;( ");
        }

        int i2 = 0;
        if (i1 == i2) {
            System.out.println("OK");
        } else {
            System.out.println(" ;( ");
        }
        long l2 = 0;

        if (l1 == l2) {
            System.out.println("OK");
        } else {
            System.out.println(" ;( ");
        }
        char c2 = 0;
        if (c1 == c2) {
            System.out.println("OK");
        } else {
            System.out.println(" ;( ");
        }
        float f2 = 0.0f;
        if (f1 == f2) {
            System.out.println("OK");
        } else {
            System.out.println(" ;( ");
        }
        double d2 = 0.0d;
        if (d1 == d2) {
            System.out.println("OK");
        } else {
            System.out.println(" ;( ");
        }
        boolean bool2 = false;
        if (bool2 == bool) {
            System.out.println("OK");
        } else {
            System.out.println(" ;( ");
        }
        Object o2 = null;
        if (o2 == o1) {
            System.out.println("OK");
        } else {
            System.out.println(" ;( ");
        }
        int znak = 'ć';
        System.out.println(znak);
    }

}
