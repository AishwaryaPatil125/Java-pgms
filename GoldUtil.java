class GoldUtil{
public static void main(String a[]){

GoldDTO dto = new GoldDTO();

dto.setGoldId(1234567);
dto.setCost(100000);
dto.setWeight("1KG");

System.out.println(dto.toString());
}
}