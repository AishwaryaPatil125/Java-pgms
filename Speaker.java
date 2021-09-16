class  Speaker{
  
   static String name="Boat";
   static int minVolume=0;
   static int maxVolume=15;
   static boolean isConnected=false;
   static int currentVolume;

public static boolean onOrOff(){
System.out.println("Inside onOrOff");
   if(isConnected==false){
      isConnected=true;
System.out.println("Speaker is turned on..............");
    return isConnected;
}
if(isConnected==false){
    return isConnected;
   }
else if(isConnected==true){
    isConnected=false;
System.out.println("Speaker is turned off.........");
    return isConnected;
}
 return false;
 }

public static void increaseVolume(){
System.out.println("inside increaseVolume()");
 if(isConnected){
      if(currentVolume < maxVolume){
      currentVolume=currentVolume+1;
System.out.println("The current Volume is :" +currentVolume);
 }
  else{
System.out.println("MaxVolume reached............");
}
}
else{
System.out.println("Gubee switch on the speaker.......");
}
System.out.println("end of increaseVolume()");
}
}


