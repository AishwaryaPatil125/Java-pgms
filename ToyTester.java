class ToyTester{

public static void main(String a[]){
Toy toy = Toy.getToy();
System.out.println(toy);

Toy toy1= Toy.getToy();
System.out.println(toy1);


Toy toy2= new Toy();
System.out.println(toy2);
Toy toy3= new Toy();
System.out.println(toy3);
}
}