package Test5_22;

import java.awt.GridLayout; //setLayout(new GridLayout(3,2));
import java.awt.event.*;
import javax.swing.*; //public class Test extends JFrame 상속받으면 사용해야함
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Test extends JFrame {
    private Map<String, Integer> userMap; // 회원 정보를 저장하는 Map

    public Test() {
        Manager manager = Manager.getInstance();
        userMap = new HashMap<>();

        this.setTitle("병원 진단 결과서");
        this.setSize(400, 300);
        this.setLayout(new GridLayout(3, 2));

        this.add(new JLabel("이름"));

        JTextField tfname = new JTextField(20);
        this.add(tfname);

        this.add(new JLabel("생년월일"));
        JPasswordField tfnumber = new JPasswordField(20);
        this.add(tfnumber);

        JButton btnJoin = new JButton("등록하기");
        this.add(btnJoin);
        btnJoin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = tfname.getText();
                int number = Integer.parseInt(tfnumber.getText());

                // 이미 등록된 이름인지 확인
                if (userMap.containsKey(name)) {
                   JOptionPane.showMessageDialog(null, "이미 등록된 이름입니다.");
                    return;
                }

                // 회원 정보 저장
                userMap.put(name, number);
                JOptionPane.showMessageDialog(null, "회원 등록이 완료되었습니다.");
            }
        });

        JButton btnLogin = new JButton("진단하기");
        this.add(btnLogin);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = tfname.getText();
                int number = Integer.parseInt(tfnumber.getText());

                if (!userMap.containsKey(name)) {
                   JOptionPane.showMessageDialog(null, "등록되지 않은 회원입니다.");
                    return;
                }

                int storedNumber = userMap.get(name);
                if (number == storedNumber) {
                   JOptionPane.showMessageDialog(null, "조회 확인");
                    new Loginframe();
                } else {
                   JOptionPane.showMessageDialog(null, "비밀번호가 틀렸습니다.");
                }
            }
        });

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Test();
    }
}