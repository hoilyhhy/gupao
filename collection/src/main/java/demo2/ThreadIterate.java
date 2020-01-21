package demo2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 第二个线程，遍历list
 */
public class ThreadIterate extends Thread{
    private  List list ;
    private LinkedList l;
    public ThreadIterate(List list){
        this.setName("迭代线程");
        this.list = list;
    }

   public void run(){
        while(true) {

            for (Iterator iterator = list.iterator(); iterator.hasNext(); iterator.next()) {
                System.out.println(this.getName()+list.size());
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
   }

}
