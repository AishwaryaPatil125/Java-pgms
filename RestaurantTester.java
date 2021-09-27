class RestaurantTester{

public static void main(String a[]){

Restaurants rest = new Restaurants();
 rest.restaurantName = "1947";
 rest.type = "Veg";
 rest.location = "Malleshwaram";
 rest.ownerName = "Sadananda Gowda";
 rest.restaurantId = 456;


rest.serveFood();
rest.displayRestaurantsDetails();

Restaurants rest1 = new Restaurants();
 rest1.restaurantName = "Empire";
 rest1.type = "Non-veg";
 rest1.location = "Karmangala";
 rest1.ownerName = "Somesh";
 rest1.restaurantId = 129;

rest1.serveFood();
rest1.displayRestaurantsDetails();


}
}
