package com.ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.connection.OpImp;
import com.emp.EmpPojo;

public class Update extends JFrame {
	JLabel jLabel1, jLabel2;
	JTextField field1, field2;
	JButton button;

	public Update() {
		setLayout(new FlowLayout());
		jLabel1 = new JLabel("Id: ");
		jLabel2 = new JLabel("Salary: ");

		field1 = new JTextField(10);
		field2 = new JTextField(10);

		button = new JButton("Update");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				EmpPojo emp = new EmpPojo();
				emp.setId(Integer.parseInt(field1.getText()));
				emp.setSalary(Double.parseDouble(field2.getText()));
				OpImp op = new OpImp();
				op.updateData(emp);
				System.out.println("up");
			}
		});

		add(jLabel1);
		add(field1);
		add(jLabel2);
		add(field2);
		add(button);

		setVisible(true);
		setSize(400, 400);
	}
}
