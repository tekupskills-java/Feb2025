package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TypesOfIterators {

    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();  //size = 0
        list.add(111);   //size = 1
        list.add(200);  //
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(500);
        list.add(400);
        list.add(200);
        list.add(400);    //
        list.add(100);   //size = 1

        for(int i = 0 ; i < list.size(); i++){
            System.out.println("Elements in list are using for loop "+list.get(i));
            list.remove(i);   //
        }

        //print odd/even elements using 2 threads

        System.out.println();

        //enhanced for loop   for each   Fail fast iterators
        /*for(Integer i : list){
            //during iteration let us modify the collection
            list.add(9999);  //CME
            list.remove();
            System.out.println("Elements in list are for each loop "+i);
        }*/

        System.out.println();

      /*  Iterator<Integer> iterator = list.iterator();   //Iterators Fail safe iterators
        while(iterator.hasNext()){
            Integer value = iterator.next();
            System.out.println("Elements in list are using iterators "+value);
            iterator.remove();  //
        }*/


    }
}
