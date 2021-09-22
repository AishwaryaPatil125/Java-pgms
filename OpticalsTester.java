class OpticalsTester{
public static void main(String a[]){

     Opticals optical = new Opticals();                 
      optical.name = "Lens Kart";
      optical.price =  3500;
      System.out.println(optical.name+" "+optical.price);
      optical.see();


     Opticals optical1 = new Opticals();                 
      optical1.name = "Oakley";
      optical1.price =  7000;
      System.out.println(optical1.name+" "+optical1.price);
      optical.see();


     Opticals optical2 = new Opticals();                 
      optical2.name = "Varilux";
      optical2.price =  18300;
      System.out.println(optical2.name+" "+optical2.price);
      optical.see();
}
}