class Jewellery{
  
  
  private static Jewellery jewellery=null;

public static Jewellery getJewellery(){
return jewellery;
}

static {
jewellery = new Jewellery();
}


}




