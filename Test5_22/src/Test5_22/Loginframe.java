package Test5_22;

import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class Loginframe extends JFrame{
	public Loginframe(){
		this.setTitle("정보입력란");
		this.setSize(1000, 1000);
		
		this.setLayout(new GridLayout(10,2));
		
		add(new JLabel("나이"));
		JTextField tfage = new JTextField(20);
		add(tfage);
		
		add(new JLabel("혈액형"));
		JTextField tfblood_type = new JTextField(20);
		add(tfblood_type);
		
		add(new JLabel("키"));
		JTextField tfHeight = new JTextField(20);
		add(tfHeight);
		
		add(new JLabel("몸무게"));
		JTextField tfweight = new JTextField(20);
		add(tfweight);
		
		add(new JLabel("혈당 수치"));
		JTextField tfBlood_sugar_level = new JTextField(20);
		add(tfBlood_sugar_level);
		
		add(new JLabel("수축기 혈압"));
		JTextField tfsystolic_blood_pressure = new JTextField(20);
		add(tfsystolic_blood_pressure);
		
		add(new JLabel("이완기 혈압"));
		JTextField tfdiastolic_blood_pressure= new JTextField(20);
		add(tfdiastolic_blood_pressure);
		
		
		add(new JLabel("")); //빈칸으로 표시하는 이유 보기에 편해서
		JButton btnJoin = new JButton("진단");
		add(btnJoin);
		btnJoin.addActionListener(new ActionListener() {

			private int wight;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				int age = Integer.parseInt(tfage.getText()); //int  나이
				
				String blood_type = tfblood_type.getText(); //혈액형
			
				int Height=Integer.parseInt(tfHeight.getText()); //키
				
				int weight=Integer.parseInt(tfweight.getText()); //몸무게
				
				int Blood_sugar_level= Integer.parseInt(tfBlood_sugar_level.getText()); //int  혈당 수치
				
				int systolic_blood_pressure= Integer.parseInt(tfsystolic_blood_pressure.getText()); //int  수축기 혈압
				
				int diastolic_blood_pressure= Integer.parseInt(tfdiastolic_blood_pressure.getText()); //int  이완기 혈압
				
				
				
				
				
				
				
				Manager manager = Manager.getInstance();
				manager.join(age,blood_type,Height,wight,Blood_sugar_level,systolic_blood_pressure,diastolic_blood_pressure);
	
				// 등록 성공 후 병원 진단 시스템으로 돌아가는 코드
		        dispose(); // 현재 창 닫기
		        new Diagnostic_Results(); // 병원 진단 시스템 창 열기
			}
			
			
		});
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}



		
	}

