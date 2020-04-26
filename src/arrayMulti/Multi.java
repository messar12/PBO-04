package arrayMulti;

import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {
        String[][] Brg;
        Brg = new String[3][3];
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Merek : ");
        Brg[0][0] = scanner.nextLine();
        System.out.println("Warna : ");
        Brg[0][1] = scanner.nextLine();
        System.out.println("Harga : ");
        Brg[1][0] = scanner.nextLine();
        System.out.println("Kondisi : ");
        Brg[1][1] = scanner.nextLine();
        System.out.println("Merk : "+Brg [0][0] + " Warna : " + Brg[0][1] + " Harga :" + Brg[1][0]+ " Kondisi : "+ Brg[1][1]);

    }
}
