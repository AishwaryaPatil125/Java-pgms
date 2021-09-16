class Operators{
  
  public static void main(String a[]){
     add(1,7);
     add(1,7,8);
     sub(4,2);
     sub(30,10,10);
     mul(8,8);
     mul(20,5,2);
     div(40,4);
     div(81,9);
     mod(20,2);

}
  public static void add(int a, int b){
System.out.println(a+b);
}
  
 public static void add(int a, int b, int c){
System.out.println(a+b+c);
}
 public static void sub(int a, int b){
System.out.println(a-b);
}
  
 public static void sub(int a, int b, int c){
System.out.println(a-b-c);
}
public static void mul(int a, int b){
System.out.println(a*b);
}
  
 public static void mul(int a, int b, int c){
System.out.println(a*b*c);
}
 
 public static void div(int a, int b){
System.out.println(a/b);
}
  
 public static void div(int a, int b, int c){
System.out.println(a/b/c);
}
 
  public static void mod(int a, int b){
System.out.println(a%b);
}




}
