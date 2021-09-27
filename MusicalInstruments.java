class MusicalInstruments{
   public String name;
   public double price;
   public String frequency;
   public String type;


public MusicalInstruments(){
System.out.println("MusicalInstruments object is created");
}

public void play(String name){                 
System.out.println("invoked play()");          //println is a method it is inbuilt
System.out.println("playing " +name+ " with friends");

System.out.println("end of play()");
}
}
