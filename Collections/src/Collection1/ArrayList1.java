package Collection1;
import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList al1 = new ArrayList();

        al1.add(33);
        al1.add(22);
        al1.add(11);
        al1.add(66);
        al1.add(55);
        al1.add(44);

        System.out.println(al1);

        ArrayList al2 = new ArrayList();
        al2.add(89);
        al2.add(49);
        al2.add(69);
        al2.add(79);
        al2.add(99);

        System.out.println(al2);

        al1.addAll(al2);

        System.out.println(al1);

        al2.remove((Integer)79);

        System.out.println(al2);

        al1.removeAll(al2);

        System.out.println(al1);

        al1.retainAll(al2);

        System.out.println(al1);

        System.out.println(al2.contains(69));

        System.out.println(al1.contains(al2));

        al2.removeFirst();
        System.out.println(al2);

        al2.removeLast();
        System.out.println(al2);

        System.out.println(al1.indexOf(11));

        ArrayList al3=new ArrayList();
        al3.add(66);
        al3.add(86);
        al3.add(76);
        al3.add(26);
        al3.add(36);
        al3.add(16);

        System.out.println(al3);
        for (int i= 0;i<al3.size();i++)
        {
            System.out.println(al3.get(i));
        }

        System.out.println(al3);

        int sum=0;
        for (Object i : al3)
        {
            sum = sum +(Integer)i;
        }
        System.out.println(sum);

        int []ar = {1,2,3,4,5,};
        for (int val:ar)
        {
            System.out.println(val);
        }

        System.out.println(al3.indexOf(26));
        System.out.println(al3.lastIndexOf(al3));

        al3.set(2,55);
        System.out.println(al3);
    }
}
