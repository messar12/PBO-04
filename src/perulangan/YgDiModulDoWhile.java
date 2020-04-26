package perulangan;

public class YgDiModulDoWhile {
    public static void main(String[] args) {
        int IsiGelas = 0;
        int Penuh = 225;
        System.out.println("Isi gelas Sekarang " + IsiGelas + "Ml");
        System.out.println("Isi Gelas Ketika Penuh " + Penuh + "Ml");
        do {
            IsiGelas++;
            System.out.println("Sedang Mengisi Gelas ...");
            System.out.println("Isi Gelas Sekarang " + IsiGelas + "Ml");

        }while (IsiGelas != Penuh);
        System.out.println("Finale : Isi Gelas Sekarang... " + IsiGelas +"Ml");
    }
}
