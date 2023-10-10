package Esecizio2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class EsercizioDue {
    public static void main(String[] args) {

        ArrayList<Integer> randomNumbersSort = orderRandomNumbers(15);
        Collections.sort(randomNumbersSort);
        System.out.println("array di numeri casuali messi in ordine crescente: " + randomNumbersSort);
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(10);
        myList.add(76);
        myList.add(35);
        myList.add(456);
        myList.add(23);
        System.out.println(reverseList(myList));
    }
    public static ArrayList<Integer> orderRandomNumbers (Integer n1) {
        Random randomNumber = new Random();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            Integer numero = randomNumber.nextInt(101);
            a.add(numero);
        }
        return a;
    }
    public static ArrayList<Integer> reverseList (ArrayList<Integer> a) {
        ArrayList<Integer> newList = new ArrayList<Integer>(a);
        ArrayList<Integer> reversedList = new ArrayList<Integer>(a);
        Collections.reverse(reversedList);
        newList.addAll(reversedList);
        return newList;
    }
}
