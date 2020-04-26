package perulangan;

import com.sun.source.tree.WhileLoopTree;

public class YgDiModulWhile {
    public static void main(String[] args) {
        int IsiGelas = 0;
        int Penuh = 225;
        System.out.println("Isi Gelas Sekarang : " + IsiGelas + "Ml");
        System.out.println("Isi Gelas Ketika Penuh : "+ Penuh + "Ml");

        while(IsiGelas != Penuh){
            IsiGelas++;
            System.out.println("Sedang Mengisi Gelas .. ");
            System.out.println("Isi Gelas Sekarang " + IsiGelas + "Ml");

        }
        System.out.println("Finale : Isi Gelas Sekarang : " + IsiGelas + "Ml");

    }
}
