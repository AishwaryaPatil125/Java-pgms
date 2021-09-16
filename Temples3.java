class Temples3  {
static String []templesName= new String[3];
public static void main(String a[]){
templesName[0]="Virupaksha";
templesName[1]="Annpurneshwari";
templesName[2]="Krishna";
gettemplesName();
}

public static void gettemplesName(){
System.out.println(templesName.length);
for(int s=0;s<templesName.length;s++){
System.out.println(templesName[s]+" ");
}

}
}