import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Set<String> setString = new HashSet<String>();
        //HashSet<String> hashString = new HashSet<String>();
        Scanner input = new Scanner(System.in);
        System.out.println("inserisci un intero che rappresenti il numero di parole da inserire");
        int resp = input.nextInt();
        for (int i = 0; i < resp ; i++) {
            String arrResp = input.nextLine();
            setString.add(arrResp);
        }
        System.out.println("parole distinte : " + setString.size());
        for (int i = 0; i < setString.size(); i++) {
            System.out.println(setString);
        }
    }
}