package demo7;

import java.util.ArrayList;
import java.util.List;

/**
 * 配置文件的转化实体类
 */
public class BeanContainer {

    private String id;
    private String clazz;
    private String factoryMethod;
    private String factoryBean;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getFactoryMethod() {
        return factoryMethod;
    }

    public void setFactoryMethod(String factoryMethod) {
        this.factoryMethod = factoryMethod;
    }

    public String getFactoryBean() {
        return factoryBean;
    }

    public void setFactoryBean(String factoryBean) {
        this.factoryBean = factoryBean;
    }

    public BeanContainer(String id, String clazz, String factoryMethod, String factoryBean) {
        this.id = id;
        this.clazz = clazz;
        this.factoryMethod = factoryMethod;
        this.factoryBean = factoryBean;
    }

    public BeanContainer() {
    }


    public static List<BeanContainer> parseXmltoBeanConfig(){
        List<BeanContainer> beanContainerList = new ArrayList<BeanContainer>();

        BeanContainer beanContainerA = new BeanContainer();
        beanContainerA.setId("a");
        beanContainerA.setClazz("demo6.A");
        beanContainerList.add(beanContainerA);

        BeanContainer beanContainerB = new BeanContainer();
        beanContainerB.setId("b");
        beanContainerB.setClazz("demo6.A");
        beanContainerB.setFactoryMethod("createBobj");
        beanContainerList.add(beanContainerB);

        BeanContainer beanContainerC = new BeanContainer();
        beanContainerC.setId("c");
        beanContainerC.setFactoryBean("a");
        beanContainerC.setFactoryMethod("createCobj");
        beanContainerList.add(beanContainerC);
        return beanContainerList;
    }
}
