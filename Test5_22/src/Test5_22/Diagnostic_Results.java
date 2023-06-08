package Test5_22;

import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class Diagnostic_Results extends JFrame{
	   public Diagnostic_Results(){
	      
	      this.setTitle("진단결과");
	      this.setSize(500, 500);
	      this.setLayout(new GridLayout(3,2));
	      add(new JLabel("혈압"));
	      JTextField tfBlood_sugar_level = new JTextField(20);
	      
	      add(new JLabel("")); //빈칸으로 표시하는 이유 보기에 편해서
	      
	      add(new JLabel("혈당 수치"));
	      JTextField tfblood_pressure= new JTextField(20);
	     
	      add(new JLabel(""));
	      add(new JLabel("BMI")); //빈칸으로 표시하는 이유 보기에 편해서
	      JTextField tfBMI= new JTextField(20);
	      
	      //빈칸으로 표시하는 이유 보기에 편해서
	      JButton btnend = new JButton("종료하기");
	      add(btnend);
	      btnend.addActionListener(new ActionListener() {

	      public void actionPerformed(ActionEvent e) {
	         int Blood_sugar_level= Integer.parseInt(tfBlood_sugar_level.getText()); //int  혈압
	         int blood_pressure=Integer.parseInt(tfblood_pressure.getText());
	         int BMI=Integer.parseInt(tfBMI.getText());
	         // TODO Auto-generated method stub
	         Manager manager = Manager.getInstance();
	         manager.Result(Blood_sugar_level, blood_pressure,BMI);
	           dispose(); // 현재 창 닫기
	           new Test(); // 병원 진단 시스템 창 열기
	      }
	   });
	   this.setVisible(true);
	   this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
	
