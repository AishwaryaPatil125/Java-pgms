class Museums{

 String museumName;
 int establishedIn;
 String state;
 String city;
  
  String names[] = {"The Louvre","The Hermitage","The British Museum","Uffizi Gallery"};
  

public Museums(){
this("Museum of Goa",2015,"Goa","Pilerne");
System.out.println("Museum object is created");
   }


  public Museums(String museumName,int establishedIn,String state,String city){
         this.museumName = museumName;
         this.establishedIn =establishedIn;
         this.state = state;
         this.city = city; 

  
  }

  public void displayMuseums(){
  System.out.println(this.museumName+" "+this.establishedIn+" "+this.state+" "+this.city);
}
  
  public void getNames(){
  for(int i=0;i<this.names.length;i++){
System.out.println(this.names[i]);
   }
  
  }
}