class StampTester{

public static void main(String a[]){
Stamp stamp = Stamp.getStamp();
System.out.println(stamp);

Stamp stamp1= Stamp.getStamp();
System.out.println(stamp1);


Stamp stamp2= new Stamp();
System.out.println(stamp2);
Stamp stamp3= new Stamp();
System.out.println(stamp3);
}
}