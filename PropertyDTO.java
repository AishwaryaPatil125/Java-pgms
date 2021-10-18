class PropertyDTO{

public PropertyDTO(){
System.out.println("PropertyDTO Object is created");
}
private long propertyId;
private String propertyName;
private String size;
private String address;


public long getPropertyId(){
  return propertyId;
}

public void setPropertyId(long propertyId){
this.propertyId=propertyId;
}

public String getPropertyName(){
  return propertyName;

}

public void setPropertyName(String propertyName){
this.propertyName=propertyName;
}


public String getSize(){
 return size;
}

public void setSize(String size){
this.size=size;
}


public String getAddress(){
  return address;
}

public void setAddress(String address){
this.address=address;
}

@Override
public String toString(){
return "PropertyDTO-{propertyId="+this.propertyId+",propertyName="+this.propertyName+",size="+this.size+",address="+this.address+"}";
}
}



