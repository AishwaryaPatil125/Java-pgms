class KFCDTO{

public KFCDTO(){
System.out.println("KFCDTO Object is created");
}
private long kfcId;
private String item;
private int price;
private String location;

public long getKfcId(){
  return kfcId;
}

public void setKfcId(long kfcId){
this.kfcId=kfcId;
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
}
