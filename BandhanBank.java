class BandhanBank extends Bank{

@Override //Annotation-->to fasten the process for the compiler
public void provideLoans(double roi){
System.out.println("Loan provided by BandhanBank");
System.out.println(roi);
}
}