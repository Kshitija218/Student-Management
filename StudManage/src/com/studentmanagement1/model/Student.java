/**
 * 
 */
package com.studentmanagement1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Kshitija
 *
 */
@Entity
@Table(name="Student1")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id") 
	private int studId;
	
	@Column(name="studname")
	private String studName;
	
	@Column(name="qlification")
	private String qlificatoin;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="address")
	private String address;
	
	@Column(name="age")
	private int age;

	public Student() {
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

	/**
	 * @return the studId
	 */
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
		return "Student [studId=" + studId + ", studName=" + studName + ", qlificatoin=" + qlificatoin + ", gender="
				+ gender + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
	
}