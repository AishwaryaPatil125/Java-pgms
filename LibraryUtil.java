class LibraryUtil{
public static void main(String a[]){

LibraryDTO dto = new LibraryDTO();

dto.setLibraryId(237689);
dto.setLibraryName("BGMIT Library");
dto.setType("College");

System.out.println(dto.getLibraryId()+" "+dto.getLibraryName()+" "+dto.getType());
}
}