class ICICIBank extends Bank{

@Override
public void provideLoans(double roi){
System.out.println("Loan provided by ICICIBank");
System.out.println(roi);
}
}