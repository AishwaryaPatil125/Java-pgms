class LibraryDTO{

public LibraryDTO(){
System.out.println("LibraryDTO Object is created");
}
private long libraryId;
private String libraryName;
private String type;

public long getLibraryId(){
  return libraryId;
}

public void setLibraryId(long libraryId){
this.libraryId=libraryId;
}

public String getLibraryName(){
  return libraryName;

}

public void setLibraryName(String libraryName){
this.libraryName=libraryName;
}

public String getType(){
 return type;
}

public void setType(String type){
this.type=type;
}

@Override
public String toString(){
return "LibraryDTO-{libraryId="+this.libraryId+",libraryName="+this.libraryName+",type="+this.type+"}";
}

}
