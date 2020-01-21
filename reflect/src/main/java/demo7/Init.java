package demo7;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

/**
 * 模拟IOC容器的加载bean的过程
 */
public class Init {

    public static void main(String[] args) throws Exception {
        List<BeanContainer> beanContainerList= BeanContainer.parseXmltoBeanConfig();//模拟解析xml，拿到beanConfigs，获得各种配置信息

        for(BeanContainer beanContainer : beanContainerList){
            String id = beanContainer.getId();
            String  clazz = beanContainer.getClazz();
            String factoryMethod = beanContainer.getFactoryMethod();
            String factoryBean = beanContainer.getFactoryBean();

            if(clazz != null ){
                if( factoryMethod == null) {//1
                    Class claz = Class.forName(clazz);
                    Object objectClass = claz.newInstance();
                    IOCContainer.putBean(id,objectClass);
                }else{//2
                    Class claz = Class.forName(clazz);
                    Method method = claz.getMethod(factoryMethod);
                    Object objectClass = method.invoke(null);
                    IOCContainer.putBean(id,objectClass);
                }
            }else if(clazz == null && factoryBean != null && factoryMethod !=null){
                Object facbean =  IOCContainer.getBean(factoryBean);
                Class facClass = facbean.getClass();
                Method m =  facClass.getMethod(factoryMethod);
                Object objectClass = m.invoke(facbean);//为什么要穿这个参数：因为他是成员方法，一定要传入调用的对象
                IOCContainer.putBean(id,objectClass);
            }




        }


    }

}
