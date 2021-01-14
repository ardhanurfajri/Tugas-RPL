import java.util.Scanner;//Library untuk inputan keyboard
//Deklarasi class
public class fungsiPengembalianNilai {
    //Deklarasi main method
    public static void main (String[]args){
        //memanggil scanner
        Scanner masukan=new Scanner(System.in);
        //Deklarasi Variable int
        int a,b,c;
        System.out.println("Proges Menjumlah 2 Nilai");
        System.out.print("Masukkan Nilai a: ");
        a=masukan.nextInt();
        System.out.print("Masukkan Nilai b: ");
        b=masukan.nextInt();
        System.out.print("Masukkan Nilai c: ");
        c=masukan.nextInt();
        System.out.println();
        System.out.println("Jumlah a + b : "+jumlah(a,b));
        System.out.println("Jumlah b + c : "+jumlah(b,c));
        System.out.println("Jumlah a + c : "+jumlah(a,c));
    }
    //Konstruktor
    private static int jumlah(int a, int b /*Parameter*/){
        int hasil=a+b;
        //Mengembalikan suatu nilai
        return hasil;
    }
}
