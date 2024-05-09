package com.connection;

import com.emp.EmpPojo;

public interface Operations {
	void insertData(EmpPojo emp);

	void updateData(EmpPojo emp);

	void deleteData(EmpPojo emp);

	void display();

}
