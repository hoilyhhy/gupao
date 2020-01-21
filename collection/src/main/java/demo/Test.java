package demo;

public class Test {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("A","apple");
        map.put("A","apple2");
        map.put("A2","apple");
        map.put("B","boy");

        System.out.println(map.get("A")+";;;"+map.size());


    }
}
