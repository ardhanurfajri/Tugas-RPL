public class praktek3 {
	//deklarasi fungsi utama
    public static void main(String[]args){
    	//deklarasi perulangan
        for(int i=1;i<=30;i++){
        	//deklarasi variable int
            int a=i;
            //deklarasi percabangan
            if(a==6||a==12||a==18||a==24){
                System.out.println();
            }else if(a==7||a==8||a==9||a==11||a==13||a==14||a==16||a==17||a==19||a==21||a==22||a==23){
                System.out.print(" ");
            }else{
                System.out.print("@");
            }
        }
    }
}
