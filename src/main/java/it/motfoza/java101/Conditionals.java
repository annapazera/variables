package it.motfoza.java101;

/**
 * Created by Anna Kacprzak on 2016-07-28.
 */
public class Conditionals {


    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        int wiek=15;
        boolean jestWGimbazie = wiek>= 13 && wiek <= 16;
            if (jestWGimbazie){
                System.out.println("Hurra");
        }

boolean nieJestWGimbazie = wiek <13 || wiek >16;
        System.out.println(nieJestWGimbazie);
        nieJestWGimbazie = ! jestWGimbazie;


        if (wiek >16 && wiek <20){
            System.out.println("liceum");
        }

        boolean nieJestWLiceum = wiek <=16 || wiek >=20;
            System.out.println(nieJestWLiceum);
        nieJestWLiceum = ! nieJestWLiceum;
        System.out.println(nieJestWLiceum);



//        if (b1) {
//            System.out.println("b1 is true");
//        } else {
//            System.out.println("b1 is false");
//        }
//        if (b2) {
//            System.out.println("b2 is true");
//        } else {
//            System.out.println("b2 is false");
//        }
//boolean c = false;
//        if (c=c){
//            System.out.println(" true");
//        }else {
//            System.out.println("false");
//        }
    }
}
