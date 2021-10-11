class Bike{
  
  
  private static Bike bike=null;

public static Bike getBike(){
return bike;
}

static {
bike = new Bike();
}


}

