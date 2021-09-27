class Weather{


public String countryName;
public String type;


public Weather(){
System.out.println("Weather object is created");
}

public void sense(){
System.out.println("Sensing Weather");
}


public void displayWeatherDetails(){
System.out.println(countryName+ " "+type);
} 
}