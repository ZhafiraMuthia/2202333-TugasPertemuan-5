package java_method;

import java.util.Scanner;

public class no3 {
    static void cekSegitiga(int a, int b, int c) {
        if (a > b || b > c) {
            System.out.println("Masukkan Tidak Valid. Pastikan a <= b <= c.");
            return;
        }

        if (a * a + b * b == c * c) {
            System.out.println("Segitiga Siku-Siku");
        } else if (a * a + b * b < c * c) {
            System.out.println("Segitiga Tumpul");
        } else {
            System.out.println("Segitiga Lancip");
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int a, b, c;

        System.out.print("Masukkan Sisi a = "); a = userInput.nextInt();
        System.out.print("Masukkan Sisi b = "); b = userInput.nextInt();
        System.out.print("Masukkan Sisi c = "); c = userInput.nextInt();

        cekSegitiga(a, b, c);
    }
}
