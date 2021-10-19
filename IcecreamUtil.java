class IcecreamUtil{
public static void main(String a[]){

IcecreamDTO dto = new IcecreamDTO();

dto.setIcecreamId(4562);
dto.setIcecreamName("Butterscotch");
dto.setPrice(50);

System.out.println(dto.toString());

IcecreamDTO dto1 = new IcecreamDTO();

dto1.setIcecreamId(785332);
dto1.setIcecreamName("Gadbad");
dto1.setPrice(80);

System.out.println(dto1.toString());

IcecreamDTO dto2 = new IcecreamDTO();

dto2.setIcecreamId(65439);
dto2.setIcecreamName("Black Current");
dto2.setPrice(75);

System.out.println(dto2.toString());

IcecreamDTO dto3 = new IcecreamDTO();

dto3.setIcecreamId(17403);
dto3.setIcecreamName("Kulfi");
dto3.setPrice(25);

System.out.println(dto3.toString());


}
}