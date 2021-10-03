class EngineerTester{
public static void main(String a[]){

CSEngg cs = new CSEngg();

cs.name="Savita";
cs.branch="CS";
cs.company="Infosys";
cs.salary=45000;

String problemSolving=cs.problemSolving();
System.out.println(problemSolving);

cs.displayDetails();



ElectricalEngg ee = new ElectricalEngg();
ee.name = "Surekha";
ee.branch = "EEE";
ee.company = "TCS";
ee.salary = 75000;

ee.displayDetails();


ECEngg ec = new ECEngg();
ec.name = "Anusha";
ec.branch = "EC";
ec.company = "Accenture";
ec.salary = 55000;

ec.displayDetails();


CivilEngg cv = new CivilEngg();
cv.name = "Roopa";
cv.branch = "CV";
cv.company = "Birla";
cv.salary = 35000;


cv.displayDetails();


MechanicalEngg me = new MechanicalEngg();
me.name = "Priya";
me.branch = "ME";
me.company = "Wipro";
me.salary = 65000;

me.displayDetails();
}
}
