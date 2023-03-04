package Runners;

import Friends.Privateaccess;
import Friends.Protectedaccess;
import Friends.Publicaccess;

public class Accessrunners {
    public static void main(String[] args) {
        Publicaccess obj=new Publicaccess();
        int q= obj.add();
        int w= obj.sub();
        int e= obj.multiply();
        int r= obj.divide();
        System.out.println(q);
        System.out.println(w);
        System.out.println(e);
        System.out.println(r);
    }
    Protectedaccess obj=new Protectedaccess();
    int h=obj.
}
