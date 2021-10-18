class ZomatoDTO{

public ZomatoDTO(){
System.out.println("ZomatoDTO Object is created");
}
private long zomatoId;
private String hotelName;
private String item;
private int price;
private String location;

public long getZomatoId(){
  return zomatoId;
}

public void setZomatoId(long zomatoId){
this.zomatoId=zomatoId;
}

public String getHotelName(){
  return hotelName;
}

public void setHotelName(String hotelName){
this.hotelName=hotelName;
}

public String getItem(){
 return item;
}

public void setItem(String item){
this.item=item;
}


public int getPrice(){
  return price;
}

public void setPrice(int price){
this.price=price;
}

public String getLocation(){
 return location;
}

public void setLocation(String location){
this.location=location;
}

@Override
public String toString(){
return "ZomatoDTO-{zomatoId="+this.zomatoId+",hotelName="+this.hotelName+",item="+this.item+",price="+this.price+",location="+this.location+"}";
}
}
