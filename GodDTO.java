class GodDTO{

public GodDTO(){
System.out.println("GodDTO Object is created");
}
private long godId;
private String godName;
private String location;


public long getGodId(){
  return godId;
}

public void setGodId(long godId){
this.godId=godId;
}

public String getGodName(){
  return godName;

}

public void setGodName(String godName){
this.godName=godName;
}

public String getLocation(){
  return location;

}

public void setLocation(String location){
this.location=location;
}


@Override
public String toString(){
return "GodDTO-{godId="+this.godId+",godName="+this.godName+",location="+this.location+"}";
}
}





