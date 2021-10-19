class JobDTO{

public JobDTO(){
System.out.println("JobDTO Object is created");
}
private long jobId;
private String companyName;
private String type;


public long getJobId(){
  return jobId;
}

public void setJobId(long jobId){
this.jobId=jobId;
}

public String getCompanyName(){
  return companyName;

}

public void setCompanyName(String companyName){
this.companyName=companyName;
}


public String getType(){
  return type;

}

public void setType(String type){
this.type=type;
}


@Override
public String toString(){
return "JobDTO-{jobId="+this.jobId+",companyName="+this.companyName+",type="+this.type+"}";
}
}





