package Test5_22;

import java.util.ArrayList;

public class Manager {	
	
	private ArrayList<Account>list=new ArrayList<>();
	//ArrayList를 사용한다. 그리고 데이터를 추가 혹은 제거하는데,
	//list라는 이름의 '어카운트 데이터(클래스)'를 보관할 수 있는 ArrayList다.
	private static Manager instance = new Manager();
	//static "static" 키워드가 사용된 변수나 메서드는 
	//해당 클래스의 인스턴스를 생성하지 않고도 직접 접근할 수 있습니다.
	//즉, 인스턴스를 생성하지 않고도 클래스에 대한 접근이 가능하며 클래스 수준에서 동작합니다.
	
	//instance는 "instance"라는 이름의 변수에 "Manager" 클래스의 인스턴스를 할당한 것은 
	//해당 클래스의 객체를 생성하기 위해서입니다.
   //클래스는 객체를 생성하기 위한 설계도이며, 클래스의 인스턴스는 
    //그 설계도를 바탕으로 실제로 메모리에 할당된 객체를 의미합니다
	
	private Manager() {list=new ArrayList<Account>();}
	// "Manager" 클래스의 private 생성자는 클래스 외부에서 해당 클래스의 인스턴스를 직접 생성하는 것을 막기 위해
	//사용됩니다. 여기서는 생성자 내부에서 "list"라는 이름의 ArrayList를 생성하고 초기화하고 있습니다.
	public static Manager getInstance() {return instance;}
	
	
	
	public void join(String name, int number) {
	
		Account acc = new Account(name,number);
		list.add(acc);
	}
	public int login(String name, int number) { 
		// TODO Auto-generated method stub
		return 0;
		
	}
	public void join(int age, String blood_type,int Height,int wight,int Blood_sugar_level,int systolic_blood_pressure,int diastolic_blood_pressure) {
		
		Account  acc= new Account(age,blood_type,Height,wight,Blood_sugar_level,systolic_blood_pressure,diastolic_blood_pressure);
		list.add(acc);
	}
	
	public void Result(int tfBlood_sugar_level,int blood_pressure,int BMI) {
		Account  acc= new Account(tfBlood_sugar_level,blood_pressure,BMI);
		list.add(acc);
	}
}


