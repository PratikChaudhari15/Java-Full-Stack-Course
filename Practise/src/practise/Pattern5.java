package practise;

public class Pattern5 {
    public static void main(String[] args){
        int num = 4;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i-1; j++){
                System.out.print("  ");
            }
            for(int k=0; k<=num-i; k++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
    }
