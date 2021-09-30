class LICDTO{

public LICDTO(){
System.out.println("LICDTO Object is created");
}
private long policyId;
private String customerName;
private int noOfYears;

public long getPolicyId(){
  return policyId;
}

public void setPolicyId(long policyId){
this.policyId=policyId;
}

public String getCustomerName(){
  return customerName;

}

public void setCustomerName(String customerName){
this.customerName=customerName;
}

public int getNoOfYears(){
  return noOfYears;
}

public void setNoOfYears(int noOfYears){
this.noOfYears=noOfYears;
}


}





