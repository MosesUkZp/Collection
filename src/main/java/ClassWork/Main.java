package ClassWork;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        MultiList<Integer, String> multiList = new MultiList<>();
        multiList.add(1, "one");
        multiList.add(1, "two");
        List<String> list = multiList.get(1);
        System.out.println(list);
    }
}
