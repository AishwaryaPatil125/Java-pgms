class MusicalInstUtil{

static MusicalInstruments music = new MusicalInstruments();

public static void main(String a[]){

   music.name = "Guitar";
   music.price = 4000.50;
   music.frequency = "20hz";
   music.type = "Western";
System.out.println(music.name+" " +music.price+" " +music.frequency+" " +music.type);
music.play(music.name);



MusicalInstruments music1 = new MusicalInstruments();
System.out.println(music1.name+" " +music1.price+" " +music1.frequency+" " +music1.type);
   music1.name = "Violin";
   music1.price = 4999.00;
   music1.frequency = "10hz";
   music1.type = "dont know";
System.out.println(music1.name+" " +music1.price+" " +music1.frequency+" " +music1.type);
music1.play(music1.name);
}
} 