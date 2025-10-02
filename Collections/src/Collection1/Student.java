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
    public int hashcode(){
        return Objects.hash(age,name,per);
    }
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return age == other.age&& Objects.equals(name,other.name) && Double.doubleToLongBits(per) == Double.doubleToLongBits(other.per);
    }
    public int compareTo(Student o)
    {
//        if (this.age>o.age)
//        {
//            return -1;
//        }
//        else if (this.age<o.age)
//        {
//            return -1;
//        }
//        return 0;

        return this.name.compareTo(o.name);
    }

}
