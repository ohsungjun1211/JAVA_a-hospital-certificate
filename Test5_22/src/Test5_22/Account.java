package Test5_22;

public class Account {
	//맴버필드
	private String name;
	private int number;
	
	private int age;
	private String blood_type;
	private int Height;
	private int wight;
	private int Blood_sugar_level;
	private int systolic_blood_pressure;
	private int diastolic_blood_pressure;
	
	
	private int blood_pressure;
	private int BMI;

	//생성자
	public Account(String name, int number) {
		this.name = name;
		this.number = number;
	}	
	public Account(int age, String blood_type,int Height,int wight,int Blood_sugar_level,int systolic_blood_pressure,int diastolic_blood_pressure) {
		this.age=age;
		this.blood_type=blood_type;
		this.Height=Height;
		this.wight=wight;
		this.Blood_sugar_level=Blood_sugar_level;
		this.systolic_blood_pressure=systolic_blood_pressure;
		this.diastolic_blood_pressure=diastolic_blood_pressure;
	}
	
	public Account(int blood_pressure,int tfBlood_sugar_level,int BMI) {
		this.blood_pressure=blood_pressure;
		this.Blood_sugar_level=tfBlood_sugar_level;
		this.BMI=BMI;
	}

}

	
