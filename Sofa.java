class Sofa{

public String brand;
public String color;
public int price;

public Sofa(String brand, String color, int price){
System.out.println("Sofa Object is created");
this.brand = brand;
this.color=color;
this.price=price;
}
public static void main(String a[]){
Sofa sofa = new Sofa("VIP","Cream",25000);
System.out.println(sofa.brand+" "+sofa.color+" "+sofa.price);
}
}