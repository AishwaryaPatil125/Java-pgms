class GameUtil{
public static void main(String a[]){

GameDTO dto = new GameDTO();

dto.setGameId(18976);
dto.setGameName("Throwball");
dto.setNoOfPlayers(9);
dto.setType("Outdoor");
System.out.println(dto.toString());

GameDTO dto1 = new GameDTO();

dto1.setGameId(78954);
dto1.setGameName("Circket");
dto1.setNoOfPlayers(12);
dto1.setType("Outdoor");
System.out.println(dto1.toString());

GameDTO dto2 = new GameDTO();

dto2.setGameId(65438);
dto2.setGameName("Chess");
dto2.setNoOfPlayers(2);
dto2.setType("Indoor");
System.out.println(dto2.toString());

GameDTO dto3 = new GameDTO();

dto3.setGameId(43567);
dto3.setGameName("Carrom");
dto3.setNoOfPlayers(4);
dto3.setType("Indoor");
System.out.println(dto3.toString());


}
}