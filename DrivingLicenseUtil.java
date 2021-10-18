class DrivingLicenseUtil{
public static void main(String a[]){

DrivingLicenseDTO dto = new DrivingLicenseDTO();

dto.setLicenseId(765930);
dto.setOwnerName("Ganesh");
dto.setType("Car");

System.out.println(dto.toString());
}
}