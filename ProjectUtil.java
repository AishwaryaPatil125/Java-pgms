class ProjectUtil{
public static void main(String a[]){

ProjectDTO dto = new ProjectDTO();

dto.setProjectId(721);
dto.setProjectName("Early Detection of Covid-19 using Deep Learning");
dto.setNoOfMembers(3);

System.out.println(dto.toString());
}
}