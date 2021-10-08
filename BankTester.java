class BankTester{

public static void main(String a[]){
  Bank bank = new BandhanBank();
  bank.provideLoans(7.5);
System.out.println(bank);

Bank bank1 = new SBIBank();
  bank1.provideLoans(5.5);
System.out.println(bank1);


Bank bank2 = new KaveriBank();
  bank2.provideLoans(6.2);
System.out.println(bank2);


Bank bank3 = new ICICIBank();
  bank3.provideLoans(8.5);
System.out.println(bank3);


Bank bank4 = new ApnaBank();
  bank4.provideLoans(7.5);
System.out.println(bank4);


Bank bank5 = new HDFCBank();
  bank5.provideLoans(8.0);
System.out.println(bank5);

}

}