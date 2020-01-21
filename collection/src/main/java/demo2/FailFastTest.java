package demo2;

        import java.util.ArrayList;
        import java.util.List;

/**
 * 用2个线程操作同一个list对象
 */
public class FailFastTest {
    private static final  List<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        new ThreadAdd(list).start();
        new ThreadIterate(list).start();

    }



}
