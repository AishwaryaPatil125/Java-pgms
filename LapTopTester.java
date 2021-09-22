class LapTopTester{
public static void main(String a[]){

    LapTop laptop = new LapTop();                 
      laptop.name = "Lenovo";
      laptop.price =  35000;
      laptop.color = "Silver";
    System.out.println(laptop.name+" "+laptop.price+" "+laptop.color);
      laptop.quality();


    LapTop laptop1 = new LapTop();                 
      laptop1.name = "Dell";
      laptop1.price =  40000;
      laptop1.color = "Black";
    System.out.println(laptop1.name+" "+laptop1.price+" "+laptop1.color);
      laptop.quality();


     LapTop laptop2 = new LapTop();                 
      laptop2.name = "HP";
      laptop2.price =  30000;
      laptop2.color = "Cream";
    System.out.println(laptop2.name+" "+laptop2.price+" "+laptop2.color);
      laptop.quality();
      

  }
}