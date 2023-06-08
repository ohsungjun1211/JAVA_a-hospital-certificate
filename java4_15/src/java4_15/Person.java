package java4_15;

public class Person {
	//맴버필드
	 static int count = 4; //카운트 4
	    private int id;
	    private String name;

//생성자
	    public Person(int id,String name){
	        this.id = id;
	        this.name = name;

	    }

	    //메서드
	    public void whoAreYou(){
	        System.out.println("ID-" + this.id + ", Name:" + this.name);
	    }

	    public void display(){
	        System.out.println("Person: ID-" + this.id + ", Name:" + this.name);
	    }

	}
