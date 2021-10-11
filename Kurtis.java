class Kurtis{
  
  
  private static Kurtis kurtis=null;

public static Kurtis getKurtis(){
return kurtis;
}

static {
kurtis = new Kurtis();
}


}




