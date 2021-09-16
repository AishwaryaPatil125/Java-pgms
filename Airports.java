class Airports  {

static String []domesticAirPorts= new String[3];
public static void main(String a[]){

domesticAirPorts[0]="SpiceJet";
domesticAirPorts[1]="Indigo";
domesticAirPorts[2]="AirIndia";
getdomesticAirPorts();
}
public static void getdomesticAirPorts(){
System.out.println(domesticAirPorts.length);
for(int s=0;s<domesticAirPorts.length;s++){
System.out.println(domesticAirPorts[s]+" ");
}
}
}
