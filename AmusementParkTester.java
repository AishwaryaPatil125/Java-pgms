class AmusementParkTester{
public static void main(String a[]){

    AmusementPark amusementpark = new AmusementPark();                 
      amusementpark.name = "Wonder la";
      amusementpark.location =  "Bengaluru";
      System.out.println(amusementpark.name+" "+amusementpark.location);
      amusementpark.visit();

    AmusementPark amusementpark1 = new AmusementPark();                 
      amusementpark1.name = "Suraj Water Park";
      amusementpark1.location =  "Thane";
      System.out.println(amusementpark1.name+" "+amusementpark1.location);
      amusementpark.visit();

     AmusementPark amusementpark2 = new AmusementPark();                 
      amusementpark2.name = "Aquatica";
      amusementpark2.location =  "Kolkata";
      System.out.println(amusementpark2.name+" "+amusementpark2.location);
      amusementpark.visit();
  }
}