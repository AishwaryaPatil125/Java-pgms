class PlanetsTester{

public static void main(String a[]){

Planets plan = new Planets();
 plan.planetName = "Earth";
 plan.color = "blue";

plan.gravity();
plan.displayPlanetsDetails();


Planets plan1 = new Planets();
 plan1.planetName = "Saturn";
 plan1.color = "pale gold";

plan1.gravity();
plan1.displayPlanetsDetails();
}
}