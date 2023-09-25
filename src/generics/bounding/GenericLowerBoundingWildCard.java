package generics.bounding;

import java.util.ArrayList;
import java.util.List;

// What is WildCard ? The Question mark is represented tje WildCard it is stand for Unknown type in generics
public class GenericLowerBoundingWildCard {

    public static void main(String[] args) {

        List<Object> ol = new ArrayList<>();
        addElements(ol);

        List<Number> nl = new ArrayList<>();
        addElements(nl);
        List<Double> dl = new ArrayList<>();
//        addElements(dl);

        List<String> sl = new ArrayList<>();
        printString(sl);


        System.out.println("---------printElements---------");
        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Generic");

        printElement(stringList);

        System.out.println("---------printObjects---------");
        List<Object> stringList2 = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Generic");
        printObject(stringList2);
    }


//super Integer --> it brings parent class of Integer
//extend Integer --> it brings child class of Integer
//parent of Integer Object, Number, Integer
    public static void addElements(List<? super Number> list){

        for (int i = 1; i < 10; i++) {
            list.add(i);
        }

    }

    public static void printString(List<? super String> list) {

        System.out.print(list);

    }

    //limitation of wildCard

    public static void printElement(List<?> listOfUnknown) {
//        listOfUnknown.add("java");//because of ? (Unknown data type, add will not accept)
        listOfUnknown.add(null);

        for (Object o : listOfUnknown) {
            System.out.println(o);
        }

    }

    public static void printObject(List<Object> listOfUnknown) {
        listOfUnknown.add("java");//because of? (Unknown data type, add will not accept)
        listOfUnknown.add(1);//because of? (Unknown data type, add will not accept)
        listOfUnknown.add(3.5);//because of? (Unknown data type, add will not accept)
        listOfUnknown.add(3.5f);//because of? (Unknown data type, add will not accept)
        listOfUnknown.add(null);

        for (Object o : listOfUnknown) {
            System.out.println(o);
        }

    }

}




