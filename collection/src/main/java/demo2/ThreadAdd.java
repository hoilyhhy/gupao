package demo2;

import java.util.List;

/**
 * 第一个线程类，往list添加元素
 */
public class ThreadAdd extends Thread{

    private List list;

    public ThreadAdd(List list) {
        this.setName("新增线程");
        this.list = list;
    }

    public void run(){
        for(int i = 0; i<100 ; i++){
            System.out.println(this.getName()+" ;loop execute : "+i);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(i+"");
        }
    }
}
