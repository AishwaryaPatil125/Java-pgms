class CameraTester{
public static void main(String a[]){

    Camera camera = new Camera();                 
      camera.name = "Canon";
      camera.price =  42650;
      System.out.println(camera.name+" "+camera.price);
      camera.picture();


     Camera camera1 = new Camera();                 
      camera1.name = "Nikon";
      camera1.price =  43999;
      System.out.println(camera1.name+" "+camera1.price);
      camera.picture();


      Camera camera2 = new Camera();                 
      camera2.name = "Sony";
      camera2.price =  57900;
      System.out.println(camera2.name+" "+camera2.price);
      camera.picture();

}
}