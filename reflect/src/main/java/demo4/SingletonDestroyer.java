package demo4;

import java.lang.reflect.Constructor;

public class SingletonDestroyer {

    public static void main(String[] args) throws Exception {
        Lazy  lazyInstance= Lazy.getInstance();
        Constructor constructor = Lazy.class.getDeclaredConstructor();

        constructor.setAccessible(true);
        Lazy lazyInstanceRefelect = (Lazy) constructor.newInstance();//不强制访问私有属性，调用不成功:can not access a member of class demo4.Lazy with modifiers "private"
        System.out.println("是否同一个对象："+(lazyInstance == lazyInstanceRefelect));
    }
}
