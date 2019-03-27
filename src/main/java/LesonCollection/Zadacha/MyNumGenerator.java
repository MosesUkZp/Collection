package LesonCollection.Zadacha;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MyNumGenerator {

    int numOfElm;
    int maxNumb;
    Random random = new Random();

    public MyNumGenerator(int numOfRlm, int maxNumb) {
        this.numOfElm = numOfRlm;
        this.maxNumb = maxNumb;
    }

     List<Integer> list (){
        List<Integer> integerList = new LinkedList<>();
        for (int i = 0; i < numOfElm; i++ ) {
            integerList.add(random.nextInt(maxNumb));
        }
        return integerList;
    }
}
