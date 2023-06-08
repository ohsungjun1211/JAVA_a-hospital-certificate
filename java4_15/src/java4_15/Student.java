package java4_15;

public class Student {
	 static int count = 2; //카운트 2
	    private int id ;
	    private String name;
	    private int grade;
	    private Teacher teacher;
	    private int SubjectCount = 0;



	    public Student(int id, String name, int grade ){
	        this.id = id;
	        this.name = name ;
	        this.grade = grade ;
	    }

	    public Student(){
	        this.SubjectCount = 1;
	    }


	    public void setId(int id ){
	        this.id = id;
	    }

	    public void setName(String name ){
	        this.name = name;
	    }

	    public void setGrade(int grade ){
	        this.grade = grade;
	    }

	    public void attendClass(Teacher teacher){
	       this.teacher = teacher;
	    }

	    public void whoAreYou(){
	        System.out.println("ID-" + this.id + ", Name:" + this.name);
	    }

	    public void display(){
	        System.out.println("Student: ID-" + this.id + ", Name:" + this.name +", Grade:" + this.grade + ",SubjectCount:" + this.SubjectCount );
	    }

	};


