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

public class Delete extends JFrame
{
	JLabel jLabel1;
	JTextField field1;
	JButton button1;
	public Delete() {
		setLayout(new FlowLayout());
				
		jLabel1 =new JLabel("Id: ");
		field1= new JTextField(10);
		button1 = new JButton("Delete");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EmpPojo emp= new EmpPojo();
				emp.setId(Integer.parseInt(field1.getText()));
				OpImp op= new OpImp();
				op.deleteData(emp);
				System.out.println("deleted");
				
			}
		});
		
		add(jLabel1);
		add(field1);
		add(button1);
		
		setVisible(true);
		setSize(600, 400);
	}

}
