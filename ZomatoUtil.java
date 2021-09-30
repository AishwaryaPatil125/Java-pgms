class ZomatoUtil{
public static void main(String a[]){

ZomatoDTO dto = new ZomatoDTO();

dto.setZomatoId(9754328);
dto.setHotelName("GaneshPrasad");
dto.setItem("Veg Biryani");
dto.setPrice(350);
dto.setLocation("Bangalore");

System.out.println(dto.getZomatoId()+" "+dto.getHotelName()+" "+dto.getItem()+" "+dto.getPrice()+" "+dto.getLocation());
}
}