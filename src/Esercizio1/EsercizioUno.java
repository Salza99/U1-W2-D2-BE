package Esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EsercizioUno {
    public static void main(String[] args) {

        Set<String> setString = new HashSet<String>();
        //HashSet<String> hashString = new HashSet<String>();
        Scanner input = new Scanner(System.in);
        System.out.println("inserisci un intero che rappresenti il numero di parole da inserire");
        Integer resp = input.nextInt();
        for (int i = 0; i < resp ; i++) {
            System.out.println("inserisci");
            String arrResp = input.nextLine();
            if (!arrResp.equals("")) {
                setString.add(arrResp);
            }

        }
        System.out.println("parole distinte : " + setString.size());
        for (String a: setString ) {
            System.out.println(a);
        }
    }
}

