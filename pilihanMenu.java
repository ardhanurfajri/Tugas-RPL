import java.util.Scanner;//Mengimport package Scanner
//Deklarasi class
public class pilihanMenu {
    //Deklarasi main method
    public static void main(String[]args){
        //Deklarasi dan Inisialisasi Variable Scanner
        Scanner masukan=new Scanner(System.in);
        //Deklarasi Variable int
        int pilihan;
        //Deklarasi Fungsi DoWhile
        do{
            //Statement
            System.out.println("\nMENU LUAS BANGUN\n");
            System.out.println("1. Menghitung Luas Persegi ");
            System.out.println("2. Menghitung Luas Persegi Panjang");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan Anda: ");
            pilihan=masukan.nextInt();
            switch(pilihan){
                case 1 : luasPersegi();break;
                case 2 : luasPersegiPanjang();break;
            }
        }while(pilihan != 3);//Condition
    }
    //Deklarasi fungsi
    private static void luasPersegi(){
        //Deklarasi dan Inisialisasi Variable Scanner
        Scanner masukan=new Scanner(System.in);
        //Deklarasi Variable Float
        float sisi,luas;
        //Menampilkan output
        System.out.print("Masukkan Nilai Sisi: ");
        //memanggil scanner
        sisi=masukan.nextFloat();
        //operasi aritmatika
        luas=sisi*sisi;
        //Output
        System.out.println("Luas Persegi adalah: "+luas);
    }
    //Deklarasi Fungsi
    private static void luasPersegiPanjang(){
        Scanner masukan=new Scanner(System.in);
        float panjang,lebar,luas;
        System.out.print("Masukkan Nilai Panjang: ");
        panjang=masukan.nextFloat();
        System.out.print("Masukkan Nilai Lebar: ");
        lebar=masukan.nextFloat();
        luas=panjang*lebar;
        System.out.println("Luas Persegi Panjang adalah: "+luas);
    }
}
