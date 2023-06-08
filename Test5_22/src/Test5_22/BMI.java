package Test5_22;

public class BMI {

	    private double weight; // 몸무게 (kg)
	    private double height; // 키 (m)

	    public BMI(double weight, double height) {
	        this.weight = weight;
	        this.height = height;
	    }

	    public double calculateBMI() {
	        return weight / (height * height);
	    }

	    public String getObesityStatus() {
	        double bmi = calculateBMI();
	        if (bmi <= 18.5) {
	            return "저체중";
	        } else if (bmi <= 22.9) {
	            return "정상";
	        } else if (bmi <= 24.9) {
	            return "과체중";
	        } else {
	            return "비만";
	        }
	    }

	    public static void main(String[] args) {
	        double weight = 70.0; // 몸무게
	        double height = 1.75; // 키
	        BMI bmiCalculator = new BMI(weight, height);
	        String obesityStatus = bmiCalculator.getObesityStatus();
	        System.out.println("비만도: " + obesityStatus);
	    }
	}

