//method overloading

class AmazonPrime{
static String movies[]={"Shershah","Cindrella","RakthaCharitra","Jaathi Rathnalu","Robert","KGF2","Yuvaratna","Master","Lights Out","Quite Place"};
static String series[]={"Mirzapur","The Family Man","Four More Shots","Vampire Diaries","Mumbai Dairies","Originals","The last shift","Inside Edge","Panchayat"};


static String movie="Dia";
public static void main(String a[]){
System.out.println("main method started");
getMovies(movies);
getSeries(series);
String mov=getMovies(movie);
System.out.println(mov);
}

public static void getMovies(String[] movies){
System.out.println("inside get Movies method with string array parameters");
for(int i=0;i<movies.length;i++){
System.out.println(movies[i]);
}
}

public static void getSeries(String[] series){
System.out.println("inside get Series method with string array parameters");
for(int i=0;i<series.length;i++){
System.out.println(series[i]);
}
}


public static String getMovies(String movie){
System.out.println("inside get Movies method");
return movie;
}

}
