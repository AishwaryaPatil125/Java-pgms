class ApnaBank extends Bank{

@Override
public void provideLoans(double roi){
System.out.println("Loan provided by ApnaBank");
System.out.println(roi);
}
}