class Stamp{
  
  
  private static Stamp stamp=null;

public static Stamp getStamp(){
return stamp;
}

static {
stamp = new Stamp();
}


}




