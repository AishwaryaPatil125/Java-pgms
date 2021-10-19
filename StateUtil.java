class StateUtil{
public static void main(String a[]){

StateDTO dto = new StateDTO();

dto.setStateId(789);
dto.setStateName("Karnataka");
dto.setCapital("Bengaluru");
System.out.println(dto.toString());

StateDTO dto1 = new StateDTO();

dto1.setStateId(349);
dto1.setStateName("Maharashtra");
dto1.setCapital("Mumbai");
System.out.println(dto1.toString());

StateDTO dto2 = new StateDTO();

dto2.setStateId(906);
dto2.setStateName("Rajasthan");
dto2.setCapital("Jaipur");
System.out.println(dto2.toString());

StateDTO dto3 = new StateDTO();

dto3.setStateId(330);
dto3.setStateName("Goa");
dto3.setCapital("Panaji");
System.out.println(dto3.toString());


}
}