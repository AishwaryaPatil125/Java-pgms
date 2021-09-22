class SweetsTester{
public static void main(String a[]){

    Sweets sweet = new Sweets();                 
      sweet.name = "GulabJamun";
      sweet.price =  100;
      sweet.shop = "Raghavendra shop";
    System.out.println(sweet.name+" "+sweet.price+" "+sweet.shop);
      sweet.eat();


    Sweets sweet1 = new Sweets();                 
      sweet1.name = "Rasgula";
      sweet1.price = 200;
      sweet1.shop = "Sai shop";
    System.out.println(sweet1.name+" "+sweet1.price+" "+sweet1.shop);
      sweet.eat();


    Sweets sweet2 = new Sweets();                 
      sweet2.name = "Mysore Paak";
      sweet2.price =  50;
      sweet2.shop = "Ganesh shop";
    System.out.println(sweet2.name+" "+sweet2.price+" "+sweet2.shop);
      sweet.eat();

  }
}