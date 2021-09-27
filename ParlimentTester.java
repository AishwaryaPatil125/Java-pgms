class ParlimentTester{

public static void main(String a[]){

Parliment parli = new Parliment();
 parli.partyName = "BJP";
 parli.members = 301;


parli.election();
parli.displayParlimentDetails();

Parliment parli1 = new Parliment();
 parli.partyName = "INC";
 parli.members = 52;

parli1.election();
parli.displayParlimentDetails();


}
}
