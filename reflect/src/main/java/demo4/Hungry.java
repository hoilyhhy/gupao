package demo4;

/**
 * 饿汉模式的单例模式
 */
public class Hungry {

    private static final Hungry instance = new Hungry();

    private Hungry(){}

    public static Hungry getInstance(){
        return instance;
    }
}
