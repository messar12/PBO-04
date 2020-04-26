package array;

import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Mhs [];
        Mhs = new String[4];
        System.out.println("Masukkan Nama : ");
        Mhs[0] = scanner.nextLine();
        System.out.println("masukkan NPM : ");
        Mhs[1] = scanner.nextLine();
        System.out.println("Masukkan Jurusan : ");
        Mhs[2] = scanner.nextLine();
        System.out.println("Masukkan Nilai IPK : ");
        Mhs[3] = scanner.nextLine();
        System.out.println("Nama : "+Mhs[0]);
        System.out.println("NPM: "+Mhs[1]);
        System.out.println("Jurusan  : "+Mhs[2]);
        System.out.println("Nilai IPK : "+Mhs[3]);

    }


}
