package test.hibernate.maven;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/***** Mise en place des variables *****/

@Entity
@Table(name = "user_table")
public class User {
	@Id
	@Column(name = "user_id")
	private int userid;
	
	@Column(name = "user_name")
	private String username;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_date")
	private Date createdDate;

/***** Mise en place des Getters & Setters *****/

public int getUserid() {
	return userid;
}

public String getUsername() {
	return username;
}

public String getCreatedBy() {
	return createdBy;
}

public Date getCreatedDate() {
	return createdDate;
}

public void setUserid(int userid) {
	this.userid = userid;
}

public void setUsername(String username) {
	this.username = username;
}

public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}


public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}
}

