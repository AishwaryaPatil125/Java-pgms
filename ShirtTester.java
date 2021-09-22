class ShirtTester{
public static void main(String a[]){

    Shirt shirt = new Shirt();                 
      shirt.name = "Flannel shirt";
      shirt.price =  2000;
      System.out.println(shirt.name+" "+shirt.price);
      shirt.wear();


     Shirt shirt1 = new Shirt();                 
      shirt1.name = "Denim shirt";
      shirt1.price =  1050;
      System.out.println(shirt1.name+" "+shirt1.price);
      shirt.wear();


     Shirt shirt2 = new Shirt();                 
      shirt2.name = "Linen shirt";
      shirt2.price =  2500;
      System.out.println(shirt2.name+" "+shirt2.price);
      shirt.wear();
}
}