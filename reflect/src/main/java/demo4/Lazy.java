package demo4;

/**
 * 懒汉模式的单例模式
 */
public class Lazy {

    private static Lazy instance;

    private Lazy(){}

    public static Lazy getInstance(){
        if(instance == null){
            synchronized (Lazy.class){
                if(instance == null){
                    instance = new Lazy();
                }
            }
        }
        return instance;
    }

}
