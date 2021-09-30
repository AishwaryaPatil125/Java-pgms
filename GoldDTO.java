class GoldDTO{

public GoldDTO(){
System.out.println("GoldDTO Object is created");
}
private long goldId;
private int cost;
private String weight;


public long getGoldId(){
  return goldId;
}

public void setGoldId(long goldId){
this.goldId=goldId;
}

public int getCost(){
  return cost;
}

public void setCost(int cost){
this.cost=cost;
}

public String getWeight(){
 return weight;
}

public void setWeight(String weight){
this.weight=weight;
}
}

