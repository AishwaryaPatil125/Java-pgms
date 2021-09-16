class CountriesName{

static String []countriesName= new String[7];

public static void main(String a[]){

countriesName[0]="India";
countriesName[1]="SriLanka";
countriesName[2]="England";
countriesName[3]="SouthAfrica";
countriesName[4]="USA";
countriesName[5]="Pakistan";
countriesName[6]="China";
getCountriesName();
}

public static void getCountriesName(){
System.out.println(countriesName.length);
for(int z=0; z<countriesName.length;z++){
System.out.println(countriesName[z]+" ");
}
}
}