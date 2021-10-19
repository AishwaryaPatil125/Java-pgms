class StateDTO{

public StateDTO(){
System.out.println("StateDTO Object is created");
}
private long stateId;
private String stateName;
private String capital;


public long getStateId(){
  return stateId;
}

public void setStateId(long stateId){
this.stateId=stateId;
}

public String getStateName(){
  return stateName;

}

public void setStateName(String stateName){
this.stateName=stateName;
}


public String getCapital(){
  return capital;

}

public void setCapital(String capital){
this.capital=capital;
}


@Override
public String toString(){
return "StateDTO-{stateId="+this.stateId+",stateName="+this.stateName+",capital="+this.capital+"}";
}
}





