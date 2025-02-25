public class V {
    public static void main(String[] args){
        for(int r=1;r<=5;r++){
            for(int c=1;c<=9;c++){
                if(r==c || c+r==10){
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
