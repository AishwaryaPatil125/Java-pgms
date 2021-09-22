class ChocolatesTester{
public static void main(String a[]){

    Chocolates chocolate = new Chocolates();                 
      chocolate.name = "Kit kat";
      chocolate.price =  25;
    System.out.println(chocolate.name+" "+chocolate.price);
      chocolate.eat();


    Chocolates chocolate1 = new Chocolates();                 
      chocolate1.name = "Dairy Milk";
      chocolate1.price =  10;
    System.out.println(chocolate1.name+" "+chocolate1.price);
      chocolate.eat();

  
    Chocolates chocolate2 = new Chocolates();                 
      chocolate2.name = "Milky bar";
      chocolate2.price =  20;
    System.out.println(chocolate2.name+" "+chocolate2.price);
      chocolate.eat();

  }
}