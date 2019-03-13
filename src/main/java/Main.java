import org.fluttercode.datafactory.impl.DataFactory;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

//    static int findChar(String s, char charToFind) {
//        int index = 1;
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == charToFind)
//                return index;
//
//        }
//        return -1;
//    }
//    public static char[] chars (String s){
//        char[] chars1 = s.toCharArray();
//        String unique = "";
//
//        for (char currentChar : chars1) {
//            if (unique.indexOf(currentChar) == -1) {
//                unique += currentChar;
//            }
//        }
//        return unique.toCharArray();
//    }

    public static void main(String[] args) {

        String email = "email@gmail.com";
        final Pattern pattern = Pattern.compile("^\\w*@\\w*\\.\\w{2,3}$");
        final Matcher matcher = pattern.matcher(email);
        if (matcher.matches()){
            System.out.println("This is email");
        }else {
            System.out.println("No email");
        }

//        System.out.println(chars("Hallo world"));


//        DataFactory dataFactory = new DataFactory();

//   System.out.println(findChar("Hallo World", 'l'));


//        StringBuilder str1 = new StringBuilder("");
//        final long start = System.currentTimeMillis();
//        for (int i = 1; i < 50000; i++) {
//            str1.append(i);
//        }
//
//        final long end = System.currentTimeMillis();
//        System.out.println(end - start + " ms");
//        System.out.println(str1);




    }
}