class BagTester{
public static void main(String a[]){

    Bag bag = new Bag();                 
      bag.name = "Sky bags";
      bag.price = 1875;
      System.out.println(bag.name+" "+bag.price);
      bag.wear();


    Bag bag1 = new Bag();                 
      bag1.name = "Wildcraft";
      bag1.price =  1070;
      System.out.println(bag1.name+" "+bag1.price);
      bag.wear();

    Bag bag2 = new Bag();                 
      bag2.name = "Gear";
      bag2.price =  1049;
      System.out.println(bag2.name+" "+bag2.price);
      bag.wear();
}
}