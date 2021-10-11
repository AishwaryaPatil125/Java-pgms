class LuggageTester{

public static void main(String a[]){
Luggage luggage = Luggage.getLuggage();
System.out.println(luggage);

Luggage luggage1= Luggage.getLuggage();
System.out.println(luggage1);


Luggage luggage2= new Luggage();
System.out.println(luggage2);
Luggage luggage3= new Luggage();
System.out.println(luggage3);
}
}