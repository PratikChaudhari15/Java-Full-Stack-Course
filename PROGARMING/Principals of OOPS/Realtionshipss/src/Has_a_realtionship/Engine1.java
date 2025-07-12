package Has_a_realtionship;

public class Engine1
{
    String color;
    double size;
    String fueltype;

    Engine1(String color,double size,String fueltype)
    {
        this.color=color;
        this.size=size;
        this.fueltype=fueltype;
    }
    public void displayEngine1()
    {
        System.out.println("color: "+color);
        System.out.println("size: "+size);
        System.out.println("fueltype: "+fueltype);
    }
}
