package Collection1;
import java.util.Objects;
public class Student implements Comparable<Student>{
    String name;
    int age;
    double per;

    public Student(){

    }
    public Student(String name,int age,double per){
        super();
        this.name =name;
        this.age = age;
        this.per = per;
    }
    public String toString()
    {
        return "[name="+name + ",age" + age + " , per=" + per +"]";
    }

}
