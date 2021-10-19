class ContinentDTO{

public ContinentDTO(){
System.out.println("ContinentDTO Object is created");
}
private long continentId;
private String continentName;
private long noOfPopulation;


public long getContinentId(){
  return continentId;
}

public void setContinentId(long continentId){
this.continentId=continentId;
}

public String getContinentName(){
  return continentName;

}

public void setContinentName(String ContinentName){
this.continentName=continentName;
}

public long getNoOfPopulation(){
  return noOfPopulation;
}

public void setNoOfPopulation(long noOfPopulation){
this.noOfPopulation=noOfPopulation;
}


@Override
public String toString(){
return "ContinentDTO-{continentId="+this.continentId+",continentName="+this.continentName+",noOfPopulation="+this.noOfPopulation+"}";
}
}





