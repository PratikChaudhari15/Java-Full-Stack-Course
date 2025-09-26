package Collection1;
import java.util.ArrayList;
import java.util.Collections;

public class Comparable_Implement {
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<Integer>();
        a.add(10);
        a.add(12);
        a.add(76);
        a.add(10);
        a.add(43);
        a.add(0);
        a.add(0);

        Collections.sort(a);

        System.out.println(a);
        System.out.println(Collections.binarySearch(a,76));

        ArrayList<Integer> temp = new ArrayList<Integer>(a);

        System.out.println(temp);
        System.out.println(Collections.disjoint(a,temp));
        System.out.println(Collections.max(a));
        System.out.println(Collections.min(a));
        System.out.println(a);


    }
}
