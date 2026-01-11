package com.pack1;

import java.io.Serializable;

public class UserBean implements Serializable
{
	private String u_fname, u_mail, u_phone, u_name, u_pwd, u_accno, u_bal;

	public UserBean() {}

	public String getU_fname() {
		return u_fname;
	}

	public void setU_fname(String u_fname) {
		this.u_fname = u_fname;
	}

	public String getU_mail() {
		return u_mail;
	}

	public void setU_mail(String u_mail) {
		this.u_mail = u_mail;
	}

	public String getU_phone() {
		return u_phone;
	}

	public void setU_phone(String u_phone) {
		this.u_phone = u_phone;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_pwd() {
		return u_pwd;
	}

	public void setU_pwd(String u_pwd) {
		this.u_pwd = u_pwd;
	}

	public String getU_accno() {
		return u_accno;
	}

	public void setU_accno(String u_accno) {
		this.u_accno = u_accno;
	}

	public String getU_bal() {
		return u_bal;
	}

	public void setU_bal(String u_bal) {
		this.u_bal = u_bal;
	}
	
	
}
