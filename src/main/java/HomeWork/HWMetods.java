package HomeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HWMetods {

//    List <Integer> integerList (List<Integer> list, int min, int max){
//
//        List<Integer> list1 = new ArrayList<>();
//
//        for(Integer i : list){
//            if (i > min && i < max){
//                list1.add(i);
//            }
//        }
//        System.out.println(list1);
//        return list1;
//
//    }

//    List<String> strings (String srt){
//
//        List<String> list1 = new ArrayList<>();
//
//        String[] str = srt.split(",");
//
//        for(String i : str){
//            if (i.length()>3){
//                list1.add(i);
//            }
//        }
//        return list1;
//    }

    static void add (Integer i, Map<Integer, Integer> map1){
        String str = i.toString();
        map1.put(i,str.length());

    }

}

