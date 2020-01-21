package demo2;

import java.util.ArrayList;

public class Test {
    Test next;
    Test prev;

    private   ArrayList a = new ArrayList();

    @org.junit.Test
    public void a(){
     //
        a.add("A");
        a.indexOf(1);
        System.out.println(a.get(0));
        System.out.println( a.indexOf("A"));

    }
}
