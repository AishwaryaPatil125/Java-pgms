class FilmIndustry{
  
  
  private static FilmIndustry filmindustry=null;

public static FilmIndustry getFilmIndustry(){
return filmindustry;
}

static {
filmindustry = new FilmIndustry();
}


}

