class LaptopTester{
public static void main(String a[]){

Dell dell = new Dell();

dell.price=40000.00;
dell.processor="Intel";
dell.storage="500GB";
dell.modelNo="qwert678";

String store=dell.store();
System.out.println(store);

dell.displayDetails();
}
}