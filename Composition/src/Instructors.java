
public class Instructors {
int instructorsID;
String instructorsName;

		String instructors;
		//Creating part-of relationship with Address class
		College instructorsCollege;
		Instructors(int istructors, String instructorsName,College instructorsCollege){
			this.instructorsID=instructorsID;
	this.instructorsName = instructorsName;
	this.instructorsCollege=instructorsCollege;
			
		}
	public static void main(String args1[]){
	College college1 = new College("Cs College");	
	College college2 = new College("Is College");
	Instructors obj1 = new Instructors(43211234,"Ali",college1);
 	Instructors obj2 = new Instructors (4123457,"Saleh",college2);
 	System.out.print(obj1.instructorsID+",");
 	System.out.println(obj1.instructorsName);
System.out.print(obj1.instructorsCollege.name+",");
System.out.println(obj2.instructorsID);
System.out.println(obj2.instructorsName);
System.out.print(obj2.instructorsCollege.name+",");

}
