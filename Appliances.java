class Appliances{

  String applianceName;
  String applianceBrand;
  String applianceCompany;
  String ownerName;
  int noOfCost;
  boolean isOpen;
  String items[] = {"Oven","Iron","Microwave","Electric fan","Mixer","Toast machine"};
  

public Appliances(){
this("Refrigerator","Acros","Whirlpool","Raganath",20000,true);
System.out.println("Appliances object is created");
   }


  public Appliances(String applianceName,
                           String applianceBrand,String applianceCompany,String ownerName,int noOfCost,boolean isOpen){
         this.applianceName = applianceName;
         this.applianceBrand = applianceBrand;
         this.applianceCompany = applianceCompany;
         this.ownerName = ownerName;
         this.noOfCost = noOfCost;
         this.isOpen = isOpen; 

  
  }

  public void displayAppliances(){
  System.out.println(this.applianceName+" "+this.applianceBrand+" "+this.applianceCompany+" "+this.ownerName+" "+this.noOfCost+" "+this.isOpen);
}
  
  public void getItems(){
  for(int i=0;i<this.items.length;i++){
System.out.println(this.items[i]);
   }
  
  }
}