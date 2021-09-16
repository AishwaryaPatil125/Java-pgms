class Engineering  {

static String []stream= new String[4]; 
public static void main(String a[]){

stream[0]="CS";
stream[1]="Mech";
stream[2]="Civil";
stream[3]="EC";
getStream();
}

public static void getStream(){
System.out.println(stream.length);
for(int z=0; z<stream.length;z++){
System.out.println(stream[z]+" ");
}
}
}