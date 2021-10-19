class GameDTO{

public GameDTO(){
System.out.println("GameDTO Object is created");
}
private long gameId;
private String gameName;
private int noOfPlayers;
private String type;


public long getGameId(){
  return gameId;
}

public void setGameId(long gameId){
this.gameId=gameId;
}

public String getGameName(){
  return gameName;

}

public void setGameName(String gameName){
this.gameName=gameName;
}

public int getNoOfPlayers(){
  return noOfPlayers;
}

public void setNoOfPlayers(int noOfPlayers){
this.noOfPlayers=noOfPlayers;
}

public String getType(){
  return type;

}

public void setType(String type){
this.type=type;
}


@Override
public String toString(){
return "GameDTO-{gameId="+this.gameId+",gameName="+this.gameName+",noOfPlayers="+this.noOfPlayers+",type="+this.type+"}";
}
}





