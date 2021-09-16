class IPL2021{
static String []teams= new String[8];

public static void main(String a[]){

teams[0]="RCB";
teams[1]="MI";
teams[2]="CSK";
teams[3]="PK";
teams[4]="SRH";
teams[5]="DC";
teams[6]="RR";
teams[7]="KKR";
getteams();
}

public static void getteams(){
System.out.println(teams.length);

    for(int s=0;s<teams.length;s++){
      System.out.println(teams[s]+" ");
      }
}
}