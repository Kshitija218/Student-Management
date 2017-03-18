package com.studmanagement1.bean;

import javax.persistence.Column;

public class StudentBean {

	private int studId;
	private String studName;
	private String qlificatoin;
	private String gender;
	private String userName;
	private String password;
    private String address;
	private int age;
	/**
	 * @return the studId
	 */
	
	public StudentBean() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public int getStudId() {
		return studId;
	}
	/**
	 * @return the studName
	 */
	public String getStudName() {
		return studName;
	}
	/**
	 * @return the qlificatoin
	 */
	public String getQlificatoin() {
		return qlificatoin;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param studId the studId to set
	 */
	public void setStudId(int studId) {
		this.studId = studId;
	}
	/**
	 * @param studName the studName to set
	 */
	public void setStudName(String studName) {
		this.studName = studName;
	}
	/**
	 * @param qlificatoin the qlificatoin to set
	 */
	public void setQlificatoin(String qlificatoin) {
		this.qlificatoin = qlificatoin;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StudentBean [studId=" + studId + ", studName=" + studName + ", qlificatoin=" + qlificatoin + ", gender="
				+ gender + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
	
	
}
