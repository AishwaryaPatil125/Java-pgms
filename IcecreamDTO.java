class IcecreamDTO{

public IcecreamDTO(){
System.out.println("IcecreamDTO Object is created");
}
private long icecreamId;
private String icecreamName;
private int price;


public long getIcecreamId(){
  return icecreamId;
}

public void setIcecreamId(long icecreamId){
this.icecreamId=icecreamId;
}

public String getIcecreamName(){
  return icecreamName;

}

public void setIcecreamName(String icecreamName){
this.icecreamName=icecreamName;
}

public int getPrice(){
  return price;
}

public void setPrice(int price){
this.price=price;
}


@Override
public String toString(){
return "IcecreamDTO-{icecreamId="+this.icecreamId+",icecreamName="+this.icecreamName+",price="+this.price+"}";
}
}





