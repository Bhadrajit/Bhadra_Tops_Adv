package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.CustomerModel;
import com.util.DBUtil;

public class CustomerDao 
{
	Connection cn=null;
	int x=0;
	public int doCustomerRegistration(CustomerModel cm)
	{
		cn=new DBUtil().getConnectionData();
		String qry="insert into customer(firstname,lastname,gender,address,mobno,email,password,status) values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, cm.getFirstname());
			st.setString(2, cm.getLastname());
			st.setString(3, cm.getGender());
			st.setString(4, cm.getAddress());
			st.setString(5, cm.getMobno());
			st.setString(6, cm.getEmail());
			st.setString(7, cm.getPassword());
			st.setString(8, cm.getStatus());
			x=st.executeUpdate();
			cn.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return x;
	}
	
	CustomerModel m=null;
	public CustomerModel getLogin(CustomerModel lm)
	{
		cn=new DBUtil().getConnectionData();
		String  qry="select * from customer where email=? and password=? and status=?";
		try {
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, lm.getEmail());
			st.setString(2 , lm.getPassword());
			st.setString(3, "Active");
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				m=new CustomerModel();
				m.setCustomerid(rs.getInt(1));
				m.setFirstname(rs.getString(2));
				m.setLastname(rs.getString(3));
				m.setGender(rs.getString(4));
				m.setAddress(rs.getString(5));
				m.setMobno(rs.getString(6));
				m.setEmail(rs.getString(7));
				m.setPassword(rs.getString(8));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return m;
	}
}







