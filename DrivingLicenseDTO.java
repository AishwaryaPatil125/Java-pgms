class DrivingLicenseDTO{

public DrivingLicenseDTO(){
System.out.println("DrivingLicenseDTO Object is created");
}
private long licenseId;
private String ownerName;
private String type;

public long getLicenseId(){
  return licenseId;
}

public void setLicenseId(long licenseId){
this.licenseId=licenseId;
}

public String getOwnerName(){
  return ownerName;

}

public void setOwnerName(String ownerName){
this.ownerName=ownerName;
}

public String getType(){
 return type;
}

public void setType(String type){
this.type=type;
}

@Override
public String toString(){
return "DrivingLicenseDTO-{licenseId="+this.licenseId+",ownerName="+this.ownerName+",type="+this.type+"}";
}

}