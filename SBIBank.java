class SBIBank extends Bank{

@Override
public void provideLoans(double roi){
System.out.println("Loan provided by SBIBank");
System.out.println(roi);
}
}