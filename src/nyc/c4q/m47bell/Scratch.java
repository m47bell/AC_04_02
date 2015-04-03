package nyc.c4q.m47bell;
/**
 * Created by c4q-marbella on 4/2/15.
 * Access Code 2-1
 * Marbella Vidals
 */

import java.util.HashSet;
import java.util.HashMap;

public class Scratch {

    public static void main(String [] args)
    {
        HashSet<Integer> odd = new HashSet<Integer>();


        odd.add(1);
        odd.add(3);
        odd.add(57);
        odd.add(7);

//
      HashSet<Integer> even = new HashSet<Integer>();
//
//        even.add(2);
        even.add(4);
        even.add(12);
        even.add(54);

        System.out.println("----");
        for(Integer num : even){

            odd.add(num);
            System.out.println(num);

        }
//
//        odd.remove(57);
//
//        System.out.println("----");
//
//        for(Integer num : odd){
//
//            System.out.println(num);
//
//        }
//
//
//         odd.addAll(even);
//
//
//        //anything thats in even and in the odd set, removes elements
//        // odd - even
//        odd.removeAll(even);
//
//        System.out.println("---");
//
//         for(Integer num :odd){
//
//             System.out.println(num);
//         }
//
//        //returns a boolean if it contain a specific num
//        System.out.println(odd.contains(1));


//       // cloning a set--creating a new set
//
//       HashSet <Integer> newOdd = new HashSet<Integer>(odd);
//
//        //compare the two sets
//        System.out.println(newOdd.equals(odd));// returns a boolean
//
//
//        //keySet
//
//        HashMap <String,Integer> fruitCount = new HashMap();
//
//        fruitCount.put("bananas", 3);
//        fruitCount.put("apples",99);
//
//        for(String fruit : fruitCount.keySet()){
//
//            System.out.println(fruit);
        }


    }


