package Collection1;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDriver  {
    public static void main(String []args)
    {

        ArrayList<Student> a1 = new ArrayList<Student>();

        a1.add(new Student("Raju",13,56.56));
        a1.add(new Student("Ramu",32,88));
        a1.add(new Student("Kaju",23,77.56));
        a1.add(new Student("Mahesh",43,45.5));
        a1.add(new Student("Ramesh",32,54));
        a1.add(new Student("Monu",45,56.4));
        a1.add(new Student("Zameer",64,76.4));
        a1.add(new Student("Sagar",13,22.89));
        a1.add(new Student("Sidya",22,66.6));

        Collections.sort(a1);
        System.out.println(a1);
    }
}