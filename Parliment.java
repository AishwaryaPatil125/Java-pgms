class Parliment{

public String partyName;
public int members;

public Parliment(){
System.out.println("Parliment object is created");
}

public void election(){
System.out.println("People elect in the parliment");
}


public void displayParlimentDetails(){
System.out.println(partyName+ " "+members);
} 
}