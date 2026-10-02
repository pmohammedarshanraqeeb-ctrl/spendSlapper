package spendslap;


import java.util.Comparator;
import java.util.InputMismatchException;
//import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

public class function{


    public void productinput(Map<String, Integer> map){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of purchase you made");

        try {
            int purchasecount = scan.nextInt();
            scan.nextLine();

            // how many elements you want to insert in the hashmap
            for (int i = 0; i < purchasecount; i++) {
                System.out.println("enter the name of purchase");
                String list = scan.nextLine();
                System.out.println("enter the amount of the purchase");
                int price = scan.nextInt();
                scan.nextLine();
                map.put(list, price);
            }
        } catch (InputMismatchException e) {
            System.out.println("enter a valid input");
        } finally {
            scan.close();
        }
    }



    public void PrintProduct(Map<String,Integer> map){
        for (Map.Entry<String, Integer> m: map.entrySet()) {
            
            System.out.println(m.getKey()+ " " + m.getValue());
        }
    }



    public void slapper(Map<String,Integer> map){
        map.entrySet()

    .stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
    .forEach(System.out::println);


    }
}
