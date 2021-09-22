class FilmIndustryTester{
public static void main(String a[]){

    FilmIndustry filmindustry = new FilmIndustry();                 
      filmindustry.filmName = "Love mocktail";
      filmindustry.actorName =  "Darling Krishna";
      filmindustry.actressName = "Milana Nagaraj";
      System.out.println(filmindustry.filmName+" "+filmindustry.actorName+" "+filmindustry.actressName);
      filmindustry.entertainment();

    FilmIndustry filmindustry1 = new FilmIndustry();                 
      filmindustry1.filmName = "Moggina Manasu";
      filmindustry1.actorName =  "Yash";
      filmindustry1.actressName = "Radhika Pandith";
      System.out.println(filmindustry1.filmName+" "+filmindustry1.actorName+" "+filmindustry1.actressName);
      filmindustry.entertainment();


    FilmIndustry filmindustry2 = new FilmIndustry();                 
      filmindustry2.filmName = "Rajahuli";
      filmindustry2.actorName =  "Yash";
      filmindustry2.actressName = "Meghana Raj";
      System.out.println(filmindustry2.filmName+" "+filmindustry2.actorName+" "+filmindustry2.actressName);
      filmindustry.entertainment();
}
}