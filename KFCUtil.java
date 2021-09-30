class KFCUtil{
public static void main(String a[]){

KFCDTO dto = new KFCDTO();

dto.setKfcId(7895433);
dto.setItem("Veg Bergur");
dto.setPrice(500);
dto.setLocation("Bangalore");

System.out.println(dto.getKfcId()+" "+dto.getItem()+" "+dto.getPrice()+" "+dto.getLocation());
}
}