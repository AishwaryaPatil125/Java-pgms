class Stadium{

public String name;
public String location;
public int noOfSeats;

public Stadium(String name, String location, int noOfSeats){
System.out.println("Stadium Object is created");
this.name = name;
this.location=location;
this.noOfSeats=noOfSeats;
}
public static void main(String a[]){
Stadium stadium = new Stadium("Kempegouda","Bangalore",1000);
System.out.println(stadium.name+ " " +stadium.location+ " "+stadium.noOfSeats);
}
}