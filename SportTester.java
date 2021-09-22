class SportTester{
public static void main(String a[]){

    Sport sport = new Sport();                 
      sport.name = "Throwball";
      sport.noOfPlayers =  9;
      System.out.println(sport.name+" "+sport.noOfPlayers);
      sport.play();


     Sport sport1 = new Sport();                 
      sport1.name = "Cricket";
      sport1.noOfPlayers =  11;
      System.out.println(sport1.name+" "+sport1.noOfPlayers);
      sport.play();


     Sport sport2 = new Sport();                 
      sport2.name = "Football";
      sport2.noOfPlayers =  11;
      System.out.println(sport2.name+" "+sport2.noOfPlayers);
      sport.play();
   }
}