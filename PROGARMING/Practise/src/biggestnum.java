public class biggestnum
{
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 3;

        int large = (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));

        System.out.println("Large number: "+large);
    }



}
