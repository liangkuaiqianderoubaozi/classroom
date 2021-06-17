package pers.tom;

import java.util.ArrayList;

public class MainApplication {

     int a = 1;

     Object test  ;

     static  Object test2  ;

    final static int b = 2;

    MainApplication(){

    }

    final static ArrayList c = new ArrayList();

    /*重载，同一对象提供的多种行为*/
    public static void main(String[] args) {
        int b = 8>>2;
        int c = 16>>3;
        System.out.println(c);


    }

    public  void main() {
        //this对象是实例化后的
        this.main();
    }

}
