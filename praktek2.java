public class praktek2 {
	//Deklarasi fungsi utama
    public static void main(String[]args){
    	//Deklarasi perulangan
        for(int i=0;i<19;i++){
        	//deklarasi variable int
            int a=i;
            //deklarasi percabangan
            if(a==0||a==5||a==6||a==10||a==11||a==12||a==15||a==16||a==17||a==18){
              System.out.print("@");  
            }else if(a==4||a==9||a==14){
                System.out.println();
            }else{
                System.out.print(" ");
            }
        }
    }
}
