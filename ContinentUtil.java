class ContinentUtil{
public static void main(String a[]){

ContinentDTO dto = new ContinentDTO();

dto.setContinentId(5706);
dto.setContinentName("Asia");
dto.setNoOfPopulation(464105477);

System.out.println(dto.toString());

ContinentDTO dto1 = new ContinentDTO();

dto1.setContinentId(432278);
dto1.setContinentName("Africa");
dto1.setNoOfPopulation(1340598147);

System.out.println(dto1.toString());

ContinentDTO dto2 = new ContinentDTO();

dto2.setContinentId(97644);
dto2.setContinentName("Europe");
dto2.setNoOfPopulation(747636026);

System.out.println(dto2.toString());

ContinentDTO dto3 = new ContinentDTO();

dto3.setContinentId(80548);
dto3.setContinentName("North America");
dto3.setNoOfPopulation(592072212);

System.out.println(dto3.toString());


}
}