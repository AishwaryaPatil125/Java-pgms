class Showroom{

public String name;
public String location;

public Showroom(String name, String location){
System.out.println("Showroom Object is created");
this.name = name;
this.location=location;
}
public static void main(String a[]){
Showroom showroom = new Showroom("Hyundai","Bangalore");
System.out.println(showroom.name+" " +showroom.location);
}
}