package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;


import com.model.ProductModel;
import com.util.DBUtil;

public class AdminProductDao 
{
	Connection cn=null;
	int x=0;
	public int addProduct(ProductModel pm)
	{
		cn=new DBUtil().getConnectionData();
		String qry="insert into product(pname,image) values(?,?)";
		try {
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, pm.getPname());
			st.setString(2, pm.getImage());
			x=st.executeUpdate();
			cn.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return x;
	}
}
