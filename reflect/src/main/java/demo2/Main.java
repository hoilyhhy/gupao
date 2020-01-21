package demo2;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        for(int i = 0;i<1000000;i++){
            //  Office office = getInstanceByKey("Excel");
              Office office =getInstanceByReflect("Excel");
        }
        long end = System.currentTimeMillis();
        System.out.println("花费时间为："+(end-start));


    }

    //普通方法,简单工厂方式
    public static  Office getInstanceByKey(String type){
        if("Excel".equals(type)){
            return new Excel();
}else if("Word".equals(type)){
        return new Word();
        }
        return null;
        }

    //反射方法
    public static  Office getInstanceByReflect(String type) throws Exception {
        String packagename = "demo2";
        Class clazz = Class.forName(packagename+"."+type);
        Field[] fields = clazz.getFields();




        return (Office) clazz.newInstance();


    }
}
