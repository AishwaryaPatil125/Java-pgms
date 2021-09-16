class ShoppingMallsName{

static String []shoppingMallsName= new String[4];
public static void main(String a[]){

shoppingMallsName[0]="Mantri";
shoppingMallsName[1]="Orion";
shoppingMallsName[2]="VR";
shoppingMallsName[3]="Phoneix";
getshoppingMallsName();
}

public static void getshoppingMallsName(){
System.out.println(shoppingMallsName.length);
for(int s=0;s<shoppingMallsName.length;s++){
System.out.println(shoppingMallsName[s]+" ");
}
}
}