class ICCTeamsTester{
public static void main(String a[]){

    ICCTeams iccteam = new ICCTeams();                 
      iccteam.name = "India";
      iccteam.rating =  119;
      System.out.println(iccteam.name+" "+iccteam.rating);
      iccteam.play();


    ICCTeams iccteam1 = new ICCTeams();                 
      iccteam1.name = "Pakistan";
      iccteam1.rating =  261;
      System.out.println(iccteam1.name+" "+iccteam1.rating);
      iccteam.play();


    ICCTeams iccteam2 = new ICCTeams();                 
      iccteam2.name = "Australia ";
      iccteam2.rating =  108;
      System.out.println(iccteam2.name+" "+iccteam2.rating);
      iccteam.play();
 }
}