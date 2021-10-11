class IronTester{

public static void main(String a[]){
Iron iron = Iron.getIron();
System.out.println(iron);

Iron iron1= Iron.getIron();
System.out.println(iron1);


Iron iron2= new Iron();
System.out.println(iron2);
Iron iron3= new Iron();
System.out.println(iron3);
}
}