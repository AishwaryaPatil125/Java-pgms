class GasCylinder{

public String name;
public String color;
public String weight;
public int price;

public GasCylinder(String name, String color, String weight, int price){
System.out.println("GasCylinder Object is created");
this.name = name;
this.color=color;
this.weight=weight;
this.price=price;
}
public static void main(String a[]){
GasCylinder gascylinder = new GasCylinder("BharatGas","Red","15KG",700);
System.out.println(gascylinder.name+" " +gascylinder.color+" " +gascylinder.weight+" " +gascylinder.price);
}
}