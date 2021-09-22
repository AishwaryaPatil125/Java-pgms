class ShoeTester{
public static void main(String a[]){

    Shoe shoe = new Shoe();                 
      shoe.name = "Puma";
      shoe.price =  6999;
      System.out.println(shoe.name+" "+shoe.price);
      shoe.wear();


    Shoe shoe1 = new Shoe();                 
      shoe1.name = "Sneakers";
      shoe1.price =  500;
      System.out.println(shoe1.name+" "+shoe1.price);
      shoe.wear();


    Shoe shoe2 = new Shoe();                 
      shoe2.name = "Adidas";
      shoe2.price =  2000;
      System.out.println(shoe2.name+" "+shoe2.price);
      shoe.wear();

   }
}

