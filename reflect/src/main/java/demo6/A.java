package demo6;

public class A {
    public A(){
        System.out.println("A 无参构造器被调用");
    }

    public static B createBobj(){
        System.out.println("A 的静态方法createBobj 被调用");
        return new B();
    }

    public C createCobj(){
        System.out.println("A 的实例方法createCobj 被调用");
        return new C();
    }

}
