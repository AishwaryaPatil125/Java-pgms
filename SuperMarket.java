class SuperMarket{
static String perfumes[]={"Eva","Watta girl","Engage","Sweet heart","VIP","Fog"};
static String fruits[]={"Mango","Orange","Strawberry","Watermelon","Apple","Chickoo","Custard apple","Sweet lemon"};

static String perfume="Ajmal";
public static void main(String a[]){
System.out.println("main method started");
getPerfumes(perfumes);
getFruits(fruits);
String perf=getPerfumes(perfume);
System.out.println(perf);
}

public static void getPerfumes(String[] perfumes){
System.out.println("inside get perfume methods with string array parameters");
for(int i=0;i<perfumes.length;i++){
System.out.println(perfumes[i]);
}
}

public static void getFruits(String[] fruits){
System.out.println("inside get fruits methods with string array parameters");
for(int i=0;i<fruits.length;i++){
System.out.println(fruits[i]);
}
}

public static String getPerfumes(perfume){
System.out.println("inside get perfume method");
return perfume;
}
}

