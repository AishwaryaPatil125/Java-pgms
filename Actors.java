class Actors{
static String actorsName[]={"Yash","Sudeep","Rakshitha Shetty","Ganesh","Anoop Bandari","Darling Krishna","Puneeth Rajkumar"};
static int noOfMovies[]={30,35,10,40,2,20,100};

public static void main(String a[]){
System.out.println("main method started");
getActorsName(actorsName);
getNoOfMovies(noOfMovies);
}

public static void getActorsName(String[] actorsName){
System.out.println("inside get actors method with string array parameters");
for(int i=0;i<actorsName.length;i++){
System.out.println(actorsName[i]);
}
}

public static void getNoOfMovies(int[] noOfMovies){
System.out.println("inside get noOfMovies method with string array parameters");
for(int i=0;i<noOfMovies.length;i++){
System.out.println(noOfMovies[i]);
}
}
}