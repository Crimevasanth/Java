Main.java
import java.util.*;
import java.util.Collections;

public class Main{

    public static void main(String[] args){
       
        ArrayList newList = new ArrayList<>();
        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(4);
        newList.add(5);
        newList.add(6);
        newList.add(7);
        newList.add(8);


        List subList = new ArrayList<>();
        subList.add(3);
        subList.add(4);
        subList.add(5);


        int ind = Collections.indexOfSubList(newList, subList);
        System.out.println("The index  is " +ind);


        LinkedList names = new LinkedList<>();
        names.add("apple");
        names.add("cow");
        names.add("elephant");
        names.add("book");
        names.add("dog");
        names.addFirst("Zebra");
        names.addLast("cycle");


        ArrayList list1 = new ArrayList<>();
        list1 = (ArrayList)newList.clone();

        Iterator IT = list1.listIterator();
       while(IT.hasNext()){
           System.out.println(IT.next());
        }

        Collections.sort(newList,Collections.reverseOrder());
        int search = Collections.binarySearch(newList, 6);
        System.out.println(search);
        int max = Collections.max(newList);
        System.out.println("The max value is " +max);


        int min= Collections.min(newList);
        System.out.println("The max value is " +min);


        Iterator IT = newList.listIterator();
        while(IT.hasNext()){
            System.out.println(IT.next());   
    }
}

