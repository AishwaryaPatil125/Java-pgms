class ModulusThreeNos{

public static void main(String a[])
{
 modulus(12,24,40);
 modulus(30,25,50);
 modulus(81,47,9);
 modulus(64,32,16);
 modulus(16,24,28);
 modulus(14,48,62);
}
public static void modulus(int a, int b, int c){
System.out.println(a%b%c);
}
}