package java_method;

import java.util.Scanner;

public class no1 {
    static void show(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n;

        System.out.print("Masukkan Nilai n = ");
        n = userInput.nextInt();

        show(n);
    }
}
