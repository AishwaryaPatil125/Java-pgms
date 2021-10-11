class Toy{
  
  
  private static Toy toy=null;

public static Toy getToy(){
return toy;
}

static {
toy = new Toy();
}


}




