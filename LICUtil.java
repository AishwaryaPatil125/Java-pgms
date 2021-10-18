class LICUtil{
public static void main(String a[]){

LICDTO dto = new LICDTO();

dto.setPolicyId(56784);
dto.setCustomerName("Anu");
dto.setNoOfYears(2);

System.out.println(dto.toString());
}
}