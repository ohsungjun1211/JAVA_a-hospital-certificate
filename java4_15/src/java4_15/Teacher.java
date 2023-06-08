package java4_15;

public class Teacher {
	    static int count = 1; //카운트 1
	    private int id;
	    private String name;
	    private String subject;
	    private int StudentCount = 1;

	    public Teacher(int id, String name, String subject ){
	        this.id = id;
	        this.name = name ;
	        this.subject = subject ;
	    }
	    public void whoAreYou(){
	        System.out.println("ID-" + this.id + ", Name:" + this.name);
	    }

	    public void display(){
	        System.out.println("Teacher: ID-" + this.id + ", Name:" + this.name + ", Subject:" + this.subject + ", StudentCount:" + this.StudentCount);
	    }
	}


