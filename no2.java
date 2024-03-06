package java_method;

import java.util.Scanner;

public class no2 {
    static void cekKubus(int s1, int s2, int s3) {
        if (s1 == s2 && s2 == s3) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Termasuk Kubus");
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int s1, s2, s3;

        System.out.print("Masukkan Sisi 1 = "); s1 = userInput.nextInt();
        System.out.print("Masukkan Sisi 2 = "); s2 = userInput.nextInt();
        System.out.print("Masukkan Sisi 3 = "); s3 = userInput.nextInt();

        cekKubus(s1, s2, s3);
    }
}
