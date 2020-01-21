package demo7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 存放beans的IOC容器
 */
public class IOCContainer {
    private static HashMap<String,Object> classHashMap = new HashMap<String, Object>();

    public  static Object getBean(String id){
        return classHashMap.get(id);
    }

    public static  void putBean(String id,Object object){
        classHashMap.put(id,object);
    }
}
