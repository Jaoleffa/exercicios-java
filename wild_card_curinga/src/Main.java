import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Teste com curinga basico
        /*
        List<?> myList = new ArrayList<>();
        List<Integer> myInts = new ArrayList<>();
        myList = myInts;

        List<Integer> myInts2 = Arrays.asList(4,2, 25);
        printList(myInts2);

        List<String> myStr = Arrays.asList("João", "Pedro", "Maria");
        printList(myStr);

         */

        //Teste com curinga delimitado
        /*
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Circle(2));
        myShapes.add(new Rectangle(5,2));

        System.out.println(totalArea(myShapes));

         */

        /*
        List<Integer> myInt = new ArrayList<>();
        myInt.add(5);
        myInt.add(10);

        List<? extends Number> list = myInt;
        System.out.println(list.get(0));
        //Não é possível adicionar pois o compilador não sabe se o valor adicionado é subtip do tipo number
        //list.add(20);

         */

        List<Integer> myInts = Arrays.asList(1,5,2,4);
        List<Double> myDoubles = Arrays.asList(2.0,4.9,2.5);
        List<Object> myObj = new ArrayList<>();

        copy(myInts, myObj);
        printList(myObj);
        copy(myDoubles, myObj);
        printList(myObj);




    }
    public static void copy (List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }
    }


    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }


}