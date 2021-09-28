class Metro{

  String metroName;
  int noOfStations;
  String location;
  String stations[] = {"Mahakavi Kevempu Road","Srirampura","Magadi","Rajajinagar","Yeshwantpur"};
  
public Metro(){
this("Namma Metro" ,51, "Bengaluru");
System.out.println("Metro object is created");
}

 public Metro(String metroName,int noOfStations,String location){
         this.metroName = metroName;
         this.noOfStations = noOfStations;
         this.location = location;
         
  }

  public void displayMetro(){
  System.out.println(this.metroName+" "+this.noOfStations+" "+this.location);
}
  
  public void getStations(){
  for(int i=0;i<this.stations.length;i++){
System.out.println(this.stations[i]);
   }
  
  }
}