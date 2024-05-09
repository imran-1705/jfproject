package com.connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.emp.EmpPojo;

public class OpImp implements Operations{
	
	@Override
	public void insertData(EmpPojo emp) {
		PreparedStatement ps;
		try {
			ps = GetConnection.getConnection()
			.prepareStatement("insert into empinfo values(?,?,?)");
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setDouble(3, emp.getSalary());
			ps.executeUpdate();
			System.out.println("Inserted");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	@Override
	public void updateData(EmpPojo emp) {
		PreparedStatement ps;
		try {
			ps = GetConnection.getConnection().prepareStatement("update empinfo set salary=? where id=?");
			ps.setDouble(1,emp.getSalary());
			ps.setInt(2, emp.getId());
			ps.executeUpdate();
			System.out.println("update");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteData(EmpPojo emp) {
		PreparedStatement ps;
		try {
			ps = GetConnection.getConnection().prepareStatement("delete from empinfo where id=?");
			ps.setInt(1, emp.getId());
			ps.executeUpdate();
			System.out.println("delete");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void display() {
			
	}
	
	

}
