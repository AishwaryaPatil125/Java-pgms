class HDFCBank extends Bank{

@Override
public void provideLoans(double roi){
System.out.println("Loan provided by HDFCBank");
System.out.println(roi);
}
}