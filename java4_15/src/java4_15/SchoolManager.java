package java4_15;

public class SchoolManager {
	private Student[] students = new Student[2];
	   private Teacher teacher;

	    public static SchoolManager getInstance() {
	        return new SchoolManager();
	    }

	     public void addMember(Student student) {
	  
	        if(this.students[0] == null){
	            this.students[0] = student;
	        }else{
	            this.students[1] = student;
	        };

	      
	        
	    }

	     public void addMember(Teacher teacher) {
	        this.teacher = teacher;
	    }

	    public void displayMemberAll() {


	        System.out.println("\n--------School Member---------\n");
	        
	        this.students[0].display();
	        this.students[1].display(); 
	        this.teacher.display();
	    }
	    

}
