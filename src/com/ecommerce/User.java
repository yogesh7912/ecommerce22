package com.ecommerce;

public class User
{
String userFirstName;
String userLastName;
long userPhoneNumber;
String userMail;
public User(String userFirstName, String userLastName, long userPhoneNumber, String userMail) {
	super();
	this.userFirstName = userFirstName;
	this.userLastName = userLastName;
	this.userPhoneNumber = userPhoneNumber;
	this.userMail = userMail;
	
}
public String getUserFirstName() {
	return userFirstName;
}
public void setUserFirstName(String userFirstName) {
	this.userFirstName = userFirstName;
}
public String getUserLastName() {
	return userLastName;
}
public void setUserLastName(String userLastName) {
	this.userLastName = userLastName;
}
public long getUserPhoneNumber() {
	return userPhoneNumber;
}
public void setUserPhoneNumber(long userPhoneNumber) {
	this.userPhoneNumber = userPhoneNumber;
}
public String getUserMail() {
	return userMail;
}
public void setUserMail(String userMail) {
	this.userMail = userMail;
}
@Override
public String toString() {
	return "User [userFirstName=" + userFirstName + ", userLastName=" + userLastName + ", userPhoneNumber="
			+ userPhoneNumber + ", userMail=" + userMail + "]";
}


}
