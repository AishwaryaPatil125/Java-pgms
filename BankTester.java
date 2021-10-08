class BankTester{

public static void main(String a[]){
//upcasting

Bank bank = new BandhanBank();
//Down casting
BandhanBank bandhanBank =(BandhanBank)bank;
bank.provideLoans(7.5);
System.out.println(bank);

Bank bank1 = new SBIBank();
SBIBank sBIBank=(SBIBank)bank1;
bank1.provideLoans(5.5);
System.out.println(bank1);

Bank bank2 = new KaveriBank();
KaveriBank kaveriBank =(KaveriBank)bank2;
bank2.provideLoans(6.5);
System.out.println(bank2);

Bank bank3 = new ICICIBank();
ICICIBank iCICIBank =(ICICIBank)bank3;
bank3.provideLoans(8.5);
System.out.println(bank3);

Bank bank4 = new ApnaBank();
ApnaBank apnaBank=(ApnaBank)bank4;
bank4.provideLoans(7.5);
System.out.println(bank4);

Bank bank5 = new HDFCBank();
HDFCBank hDFCBank =(HDFCBank)bank5;
bank5.provideLoans(8.0);
System.out.println(bank5);

}
}
