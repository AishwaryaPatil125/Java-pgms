class CurrencyDTO{

public CurrencyDTO(){
System.out.println("CurrencyDTO Object is created");
}
private long currencyId;
private String currencyName;
private String capital;


public long getCurrencyId(){
  return currencyId;
}

public void setCurrencyId(long currencyId){
this.currencyId=currencyId;
}

public String getCuurencyName(){
  return currencyName;

}

public void setCurrencyName(String currencyName){
this.currencyName=currencyName;
}


public String getCapital(){
  return capital;

}

public void setCapital(String capital){
this.capital=capital;
}


@Override
public String toString(){
return "CurrencyDTO-{currencyId="+this.currencyId+",currencyName="+this.currencyName+",capital="+this.capital+"}";
}
}





