class  SocialMedia{
static String apps[]={"Watsapp","Instagram","Facebook","Twitter","Telegram","Snapchat","Gmail","Linkedin","Zomato"};


public static void main(String a[]){
System.out.println("main method started");
getApps(apps);
}




public static void getApps(String[] apps){
System.out.println("inside get apps method with string array parameters");
for(int i=0;i<apps.length;i++){
System.out.println(apps[i]);
}
}
}