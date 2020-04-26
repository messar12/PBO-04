package perulangan;

import org.w3c.dom.ls.LSOutput;

public class PerulanganWhile {
    public static void main(String[] args) {
        int x = 0;
        while (x < 50) {
            System.out.println("Sedang Mengisi Lemari =" + x);
            x++;
        }
        System.out.println("Lemari Penuh ! ");
    }

}
