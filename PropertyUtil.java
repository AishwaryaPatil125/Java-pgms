class PropertyUtil{
public static void main(String a[]){

PropertyDTO dto = new PropertyDTO();

dto.setPropertyId(1234567);
dto.setPropertyName("Prestige Group");
dto.setSize("1974sq.ft");
dto.setAddress("Bangalore");

System.out.println(dto.getPropertyId()+" "+dto.getPropertyName()+" "+dto.getSize()+" "+dto.getAddress());
}
}