class HomeTheatre{
  
  
  private static HomeTheatre hometheatre=null;

public static HomeTheatre getHomeTheatre(){
return hometheatre;
}

static {
hometheatre = new HomeTheatre();
}


}
