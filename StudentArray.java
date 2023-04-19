package array;

class StudentArray { //main class
	//declaring instance variables
	int studentNo;
    String Name,Mail,Address;
    double fees;
    // static member for increaseFees method
static double increasedFees;

/*creating constructor for assessing the details to student passing values through
 *  overloaded constructor*/
StudentArray(int sn, String name,String mail,
		String address){
	this.studentNo=sn;
	this.Name=name;
	this.Mail=mail;
	this.Address=address;
}
//method for initializing fees to student
void fees(double f) {
	fees=f; // assigning passing value
}
//method for printing output
//for concatenation and SOP the output
void display() {
	//updating fees before printing
	this.fees=this.fees+increasedFees;
	System.out.println("Id-" +this.studentNo+"   "+ "Name-" +this.Name+"   "+"Mail-" +this.Mail+"   "+ "Address-" +this.Address +" Fees-" +fees);
}
//increasing fees method
static void increaseFees(int n, double f) {
	if(f<2000) {  //condition
		f=10*f/100; // logic for increasing fees
		increasedFees=f;//assigning the value to static instance
	}
}
//main method
public static void main(String[] args)
{
	//Instantiating Student type of array and declaration
	StudentArray[] student = new StudentArray[5];
	
	//Instantiating objects of StudentClass and initializing
	student[0]= new StudentArray(101,"Akash","akash@gmail.com","Somewhere, Bihar");
	student[1]= new StudentArray(102,"Sayan","sayan@gmail.com","Somewhere, Maharashtra ");
	student[2]= new StudentArray(103,"Sagnik","sagnik@gmail.com","Somewhere, Karnatak");
	student[3]= new StudentArray(104,"Ravi","ravi@gmail.com","Somewhere, Hydrabaad");
	student[4]= new StudentArray(105,"Owashim","owashim@gmail.com","Somewhere, Beed");
							
	//adding fees values
	student[0].fees(1064);
	student[1].fees(2056);
	student[2].fees(957);
	student[3].fees(1999);
	student[4].fees(2001);
	
	//increasing fees whose fees is less than 2000
	increaseFees(100,1064);
	increaseFees(102,957);
	increaseFees(103,1999);
	
	//traversing the array of the student objects
	System.out.println("______________________Details of Students____________________");
	for(StudentArray i:student) {
		i.display();//traversing with invocation of display
	}
}
}
