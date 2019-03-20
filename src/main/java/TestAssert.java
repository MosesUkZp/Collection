import java.util.Arrays;

public class TestAssert {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 19;
//        assert  b == a;
//        System.out.println("Program exit");
//
        System.out.println(MyDirectin.NORTH);
        System.out.println(MyDirectin.NORTH.name());
        System.out.println(MyDirectin.EAST.ordinal());
        System.out.println(Arrays.toString(MyDirectin.values()));
        System.out.println(MyDirectin.valueOf("EAST"));
    }
}
