package ex_14;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Date dt = new Date(requestInput("Enter month: ", sc),
                requestInput("Enter day: ", sc),
                requestInput("Enter year: ", sc));

        dt.displayDate();

    }

    public static int requestInput(String s, Scanner sc) {
        System.out.print(s);
        return sc.nextInt();
    }
}