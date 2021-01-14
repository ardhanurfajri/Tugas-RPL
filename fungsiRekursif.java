import java.util.Scanner;//Library untuk Scanner
//Deklarasi class
public class fungsiRekursif{
    //Deklarasi fungsi rekursif
    private static int faktorial(int a){
        //Deklarasi percabangan if
        if(a==1){
            return 1;//mengembalikan nilai 1
        }else{
            return a*faktorial(a-1);//memanggil fungsi faktorial() dan mengembalikan suatu nilai
        }
    }
    //Deklarasi fungsi utama
    public static void main(String[]args){
        //Deklarasi Variable dan Inisialisasi Scanner
        Scanner masukan=new Scanner(System.in);
        //Deklarasi Variable int
        int bil,hasil;
        System.out.print("Masukkan suatu bilangan: ");
        bil=masukan.nextInt();
        hasil=faktorial(bil);
        System.out.println("Nilai faktorial "+bil+" adalah "+hasil);
    }
}
