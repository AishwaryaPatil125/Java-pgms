class GodUtil{
public static void main(String a[]){

GodDTO dto = new GodDTO();

dto.setGodId(85430);
dto.setGodName("Isckon temple");
dto.setLocation("Bangalore");
System.out.println(dto.toString());

GodDTO dto1 = new GodDTO();

dto1.setGodId(95043);
dto1.setGodName("Sai baba");
dto1.setLocation("Mahalingpur");
System.out.println(dto1.toString());

GodDTO dto2 = new GodDTO();

dto2.setGodId(940732);
dto2.setGodName("Banashankari Devi");
dto2.setLocation("Badami");
System.out.println(dto2.toString());

GodDTO dto3 = new GodDTO();

dto3.setGodId(85437);
dto3.setGodName("Malikarjuna");
dto3.setLocation("Shrishail");
System.out.println(dto3.toString());


}
}