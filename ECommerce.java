class ECommerce{

  String ecommerceName;
  String ecommerceType;
  String ecommerceSite;
  String names[] = {"Ready Online","Crafty Commerce","Tech Shop","Czar Shop"};
  

public ECommerce(){
this("Wish Bin","B2B","FilpKart");
System.out.println("ECommerce object is created");
   }


  public ECommerce(String ecommerceName,String ecommerceType,String ecommerceSite){
         this.ecommerceName = ecommerceName;
         this.ecommerceType = ecommerceType;
         this.ecommerceSite = ecommerceSite;
         
  
  }

  public void displayECommerce(){
  System.out.println(this.ecommerceName+" "+this.ecommerceType+" "+this.ecommerceSite);
}
  
  public void getNames(){
  for(int i=0;i<this.names.length;i++){
System.out.println(this.names[i]);
   }
  
  }
}