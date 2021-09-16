class CountryName{

public static void main(String a[]){

String[] countryName= new String[7];
countryName[0]="India";
countryName[1]="SriLanka";
countryName[2]="England";
countryName[3]="SouthAfrica";
countryName[4]="USA";
countryName[5]="Pakistan";
countryName[6]="China";

int[] noOfStates= new int[7];
noOfStates[0]=29;
noOfStates[1]=11;
noOfStates[2]=34;
noOfStates[3]=45;
noOfStates[4]=23;
noOfStates[5]=9;
noOfStates[6]=12;


for(int z=0; z<countryName.length;z++){
System.out.println(countryName[z]+" ");
}
for(int z=0; z<noOfStates.length;z++){
System.out.println(noOfStates[z]+" ");
}


}
}