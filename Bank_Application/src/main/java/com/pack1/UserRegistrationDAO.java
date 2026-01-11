package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserRegistrationDAO 
{
	public int insert_NewUserRecord(UserBean ub)
	{
		int rowCount=0;
		try
		{
			Connection con=DBConnect.connect();
			PreparedStatement pstmt=con.prepareStatement("insert into bank_users (FULL_NAME, EMAIL,USERNAME, PASSWORD, PHONE_NUMBER,ACCOUNT_NUMBER,BALANCE,CREATED_AT) values (?,?,?,?,?,?,?,SYSDATE)");
		
			pstmt.setString(1, ub.getU_fname());
			pstmt.setString(2, ub.getU_name());
			pstmt.setString(3, ub.getU_mail());
			pstmt.setString(4, ub.getU_phone());
			pstmt.setString(5, ub.getU_accno());
			pstmt.setString(6, ub.getU_bal());
			pstmt.setString(7, ub.getU_pwd());
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return rowCount;
	}
}
