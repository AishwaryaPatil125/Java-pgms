class KaveriBank extends Bank{

@Override
public void provideLoans(double roi){
System.out.println("Loan provided by KaveriBank");
System.out.println(roi);
}
}