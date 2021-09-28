class FancyStore{

  String storeName;
  String location;
  String ownerName;
  boolean isOpen;
  String items[] = {"Fancy Bags","Bangles","Ornaments","Cosmetics"};
  

public FancyStore(){
this("Kamal Fancy","Bangalore","Pooja" , true);
System.out.println("FancyStore object is created");
   }


  public FancyStore(String storeName,String location,String ownerName,boolean isOpen){
         this.storeName = storeName;
         this.location = location;
         this.ownerName = ownerName;
         this.isOpen = isOpen; 

  
  }

  public void displayFancyStore(){
  System.out.println(this.storeName+" "+this.location+" "+this.ownerName+" "+this.isOpen);
}
  
  public void getItems(){
  for(int i=0;i<this.items.length;i++){
System.out.println(this.items[i]);
   }
  
  }
}