package Has_a_realtionship;

public class AeroplaneDriver
{
    public static void main(String[] args)
    {
         Aeroplane a1 = new Aeroplane("AirIndia",13000,"Private","red",400,"white");
         a1.displayAeroplane();
        System.out.println("-----------");
        Aeroplane a2 = new Aeroplane("Akasa",25000,"COmmerical","Blue",200,"white");
        a2.displayAeroplane();
        a2.rf.displayEngine1();
    }
}
