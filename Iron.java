class Iron{
  
  
  private static Iron iron=null;

public static Iron getIron(){
return iron;
}

static {
iron = new Iron();
}


}




