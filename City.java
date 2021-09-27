class City{

public String cityName;
public int population;
public String area;

public City(){
System.out.println("City object is created");
}

public void visitors(){
System.out.println("People visiting the city");
}


public void displayCityDetails(){
System.out.println(cityName+ " "+population+" "+area);
} 
}