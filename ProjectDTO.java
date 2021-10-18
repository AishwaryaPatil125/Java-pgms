class ProjectDTO{

public ProjectDTO(){
System.out.println("ProjectDTO Object is created");
}
private long projectId;
private String projectName;
private int noOfMembers;


public long getProjectId(){
  return projectId;
}

public void setProjectId(long projectId){
this.projectId=projectId;
}

public String getProjectName(){
  return projectName;

}

public void setProjectName(String projectName){
this.projectName=projectName;
}

public int getNoOfMembers(){
  return noOfMembers;
}

public void setNoOfMembers(int noOfMembers){
this.noOfMembers=noOfMembers;
}

@Override
public String toString(){
return "ProjectDTO-{projectId="+this.projectId+",projectName="+this.projectName+",noOfMembers="+this.noOfMembers+"}";
}
}





