class CurrencyUtil{
public static void main(String a[]){

CurrencyDTO dto = new CurrencyDTO();

dto.setCurrencyId(63);
dto.setCurrencyName("Australian Dollar");
dto.setCapital("Canberra");
System.out.println(dto.toString());

CurrencyDTO dto1 = new CurrencyDTO();

dto1.setCurrencyId(75);
dto1.setCurrencyName("Bhutan Ngultrum");
dto1.setCapital("Thimphu");
System.out.println(dto1.toString());

CurrencyDTO dto2 = new CurrencyDTO();

dto2.setCurrencyId(48);
dto2.setCurrencyName("Canadian Dollar");
dto2.setCapital("Ottawa");
System.out.println(dto2.toString());

CurrencyDTO dto3 = new CurrencyDTO();

dto3.setCurrencyId(59);
dto3.setCurrencyName("Pound Sterling");
dto3.setCapital("St.Peter Port");
System.out.println(dto3.toString());


}
}