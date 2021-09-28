class Transportation{

  String transportName;
  String location;
  String transportId;
  
  
  String means[] = {"Van","Helicopter","Taxi","Bike","Car","Parachute"};
  

public Transportation(){
this("Bus","KA 02 S001","Bangalore");
System.out.println("Transportation object is created");
   }


  public Transportation(String transportName,String location,String transportId){
         this.transportName = transportName;
         this.location = location;
         this.transportId = transportId;
         
  }

  public void displayTransportation(){
  System.out.println(this.transportName+" "+this.transportId+" "+this.location);
}
  
  public void getMeans(){
  for(int i=0;i<this.means.length;i++){
System.out.println(this.means[i]);
   }
  
  }
}