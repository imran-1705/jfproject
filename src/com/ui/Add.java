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

public class Add extends JFrame
{
	JLabel jLabel1,jLabel2,jLabel3;
	JTextField field1,field2,field3;
	JButton button1;
	
	public Add() {
		setLayout(new FlowLayout());
			
		jLabel1 =new JLabel("Id: ");
		jLabel2 =new JLabel("Name: ");
		jLabel3 =new JLabel("Salary: ");
		
		field1= new JTextField(10);
		field2= new JTextField(10);
		field3= new JTextField(10);
		
		button1 = new JButton("Add");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("inserted");
				EmpPojo emp= new EmpPojo();
				emp.setId(Integer.parseInt(field1.getText()));
				emp.setName(field2.getText());
				emp.setSalary(Double.parseDouble(field3.getText()));
				
				OpImp op = new OpImp();
				op.insertData(emp);
			}
		});
		
		add(jLabel1);
		add(field1);
		add(jLabel2);
		add(field2);
		add(jLabel3);
		add(field3);
		
		add(button1);
		
		setVisible(true);
		setSize(600, 400);
	}
}
