class ApplicationsTester{
public static void main(String a[]){

    Applications application = new Applications();                 
      application.appName = "Watsapp";
      application.downloadOn =  "SmartPhone";
      System.out.println(application.appName+" "+application.downloadOn);
      application.information();

    Applications application1 = new Applications();                 
      application1.appName = "Facebook";
      application1.downloadOn =  "SmartPhone";
      System.out.println(application1.appName+" "+application1.downloadOn);
      application.information();


    Applications application2 = new Applications();                 
      application2.appName = "Instagram";
      application2.downloadOn =  "SmartPhone";
      System.out.println(application2.appName+" "+application2.downloadOn);
      application.information();
}
}