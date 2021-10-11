class Luggage{
  
  
  private static Luggage luggage=null;

public static Luggage getLuggage(){
return luggage;
}

static {
luggage = new Luggage();
}


}




