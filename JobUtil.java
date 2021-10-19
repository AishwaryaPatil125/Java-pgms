class JobUtil{
public static void main(String a[]){

JobDTO dto = new JobDTO();

dto.setJobId(6794);
dto.setCompanyName("Capgemini");
dto.setType("Private");
System.out.println(dto.toString());

JobDTO dto1 = new JobDTO();

dto1.setJobId(7806);
dto1.setCompanyName("Accenture");
dto1.setType("Private");
System.out.println(dto1.toString());

JobDTO dto2 = new JobDTO();

dto2.setJobId(3427);
dto2.setCompanyName("HPCL");
dto2.setType("Govt");
System.out.println(dto2.toString());

JobDTO dto3 = new JobDTO();

dto3.setJobId(1987);
dto3.setCompanyName("IRFC");
dto3.setType("Govt");
System.out.println(dto3.toString());


}
}