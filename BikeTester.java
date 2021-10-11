class BikeTester{

public static void main(String a[]){
Bike bike = Bike.getBike();
System.out.println(bike);

Bike bike1= Bike.getBike();
System.out.println(bike1);


Bike bike2= new Bike();
System.out.println(bike2);
Bike bike3= new Bike();
System.out.println(bike3);
}
}