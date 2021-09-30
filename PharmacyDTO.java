class PharmacyDTO{

public PharmacyDTO(){
System.out.println("PharmacyDTO Object is created");
}
private long pharmacyId;
private String shopName;
private String location;

public long getPharmacyId(){
  return pharmacyId;
}

public void setPharmacyId(long pharmacyId){
this.pharmacyId=pharmacyId;
}

public String getShopName(){
  return shopName;

}

public void setShopName(String shopName){
this.shopName=shopName;
}

public String getLocation(){
 return location;
}

public void setLocation(String location){
this.location=location;
}

}
