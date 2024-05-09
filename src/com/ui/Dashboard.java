package com.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Dashboard extends JFrame {
	JMenu menu1, menu2, menu3, menu4;
	JMenuItem item1, item2, item3;
	JMenuItem show, search;
	JMenuItem salary;
	JMenuItem help, tod, exit;
	JMenuBar bar;

	public Dashboard() {
		setLayout(null);

		bar = new JMenuBar();
		bar.setBounds(0, 0, 400, 30);
		menu1 = new JMenu("Employee");
		item1 = new JMenuItem("Add");
		item1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Add");
				new Add();
			}
		});
		item2 = new JMenuItem("Update");
		item2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Update();
			}
		});
		item3 = new JMenuItem("Delete");
		item3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Delete();
			}
		});

		// JMenu 2
		menu2 = new JMenu("Employee Detail");
		show = new JMenuItem("Show");
		search = new JMenuItem("Search");

		// JMenu 3
		menu3 = new JMenu("Account");
		salary = new JMenuItem("Employee Salary");

		// JMenu 4
		menu4 = new JMenu("Utilites");
		help = new JMenuItem("Help");
		tod = new JMenuItem("TOD");
		exit = new JMenuItem("Exit");
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});

		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		
		menu2.add(show);
		menu2.add(search);
		
		menu3.add(salary);
		
		menu4.add(help);
		menu4.add(tod);
		menu4.add(exit);
		
		bar.add(menu1);
		bar.add(menu2);
		bar.add(menu3);
		bar.add(menu4);

		add(bar);
		setVisible(true);
		setSize(400, 400);
	}
}
