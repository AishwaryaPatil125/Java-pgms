class WeatherTester{

public static void main(String a[]){

Weather weat = new Weather();
 weat.countryName = "India";
 weat.type = "Hot";
 
weat.sense();
weat.displayWeatherDetails();

Weather weat1 = new Weather();
 weat1.countryName = "Russia";
 weat1.type = "Cold";
 
weat1.sense();
weat1.displayWeatherDetails();


}
}
