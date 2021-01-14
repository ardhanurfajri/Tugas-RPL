public class praktek1 {
    //Deklarasi fungsi utama
    public static void main(String[]args){
        //Deklarasi perulangan
        for(int i=0;i<19;i++){
            //Deklarasi Variable
            int a=i;
            //Deklarasi percabangan
            if(a==6||a==7||a==11||a==12){
                System.out.print(" ");               
            }else if(a==4||a==9||a==14){
                System.out.println();
            }else{
                System.out.print("@");
            }
        }
    }
}
