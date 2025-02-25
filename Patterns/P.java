public class P {
    public static void main(String[]args){
        for(int r=1;r<=5;r++){
            for(int c=1;c<=4;c++){
                if(r==1 || r==3 || c==1 ||(r==2 & c==4)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
