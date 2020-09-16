package model;
//complaint parameters
public class Complaintdetails {
private String name;
private String mobilenumber;
private String complaint;



public Complaintdetails(String name, String mobilenumber, String complaint) {
	super();
	this.name = name;
	this.mobilenumber = mobilenumber;
	this.complaint = complaint;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(String mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public String getComplaint() {
	return complaint;
}
public void setComplaint(String complaint) {
	this.complaint = complaint;
}

}
