class IceCreamsTester{
public static void main(String a[]){

    IceCreams icecream = new IceCreams();                 
      icecream.name = "Gadbad";
      icecream.price =  50;
      System.out.println(icecream.name+" "+icecream.price);
      icecream.eat();

    IceCreams icecream1 = new IceCreams();                 
      icecream1.name = "Choco bar";
      icecream1.price =  25;
      System.out.println(icecream1.name+" "+icecream1.price);
      icecream.eat();

    IceCreams icecream2 = new IceCreams();                 
      icecream2.name = "Black Current";
      icecream2.price =  100;
      System.out.println(icecream2.name+" "+icecream2.price);
      icecream.eat();

   }
}

