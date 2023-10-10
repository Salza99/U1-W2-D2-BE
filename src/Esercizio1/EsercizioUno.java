package Esercizio1;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class EsercizioUno {
    public static void main(String[] args) {

        Set<String> setPeroleDistinte = new HashSet<String>();
        Set<String> setParoleDuplicate = new HashSet<String>();
        Scanner input = new Scanner(System.in);
        System.out.println("inserisci un intero che rappresenti il numero di parole da inserire");
        try {
            Integer resp = input.nextInt();
            input.nextLine();
            for (int i = 0; i < resp ; i++) {
                String arrResp = input.nextLine();

                if (!setPeroleDistinte.add(arrResp)) {
                    setParoleDuplicate.add(arrResp);
                }

            }
        }catch (InputMismatchException ex){
            System.out.println("il valore non è un intero");
        }



        System.out.println("parole duplicate : ");
        for (String a: setParoleDuplicate) {
            System.out.println(a);
        }
        System.out.println("numero parole distinte : " + setPeroleDistinte.size());
        for (String a: setPeroleDistinte ) {
            System.out.println(a);
        }
    }
}

