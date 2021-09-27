class Restaurants{

public int restaurantId;
public String restaurantName;
public String type;
public String location;
public String ownerName;

public Restaurants(){
System.out.println("Restaurant object is created");
}

public void serveFood(){
System.out.println("Serving food with delicious items");
}


public void displayRestaurantsDetails(){
System.out.println(restaurantName+ " "+type+" "+location+" "+ownerName+" "+restaurantId);
} 
}