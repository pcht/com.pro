package dto;

import java.sql.Date;

public class AccountDTO extends AbstractFeatureDTO {
	private int id;
	private String userName;
	private String passWord;
	private String email;
	private int isSuperUser;
	private int isStaff;
	private Date lastLogin;
	private Date dateJoined;

	public AccountDTO() {
		super();
	}

	public AccountDTO(AccountDTO accountDTO) {
		this.id = accountDTO.id;
		this.userName = accountDTO.userName;
		this.passWord = accountDTO.passWord;
		this.email = accountDTO.email;
		this.isSuperUser = accountDTO.isSuperUser;
		this.isStaff = accountDTO.isStaff;
		this.lastLogin = accountDTO.lastLogin;
		this.dateJoined = accountDTO.dateJoined;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIsSuperUser() {
		return isSuperUser;
	}

	public void setIsSuperUser(int isSuperUser) {
		this.isSuperUser = isSuperUser;
	}

	public int getIsStaff() {
		return isStaff;
	}

	public void setIsStaff(int isStaff) {
		this.isStaff = isStaff;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Date getDateJoined() {
		return dateJoined;
	}

	public void setDateJoined(Date dateJoined) {
		this.dateJoined = dateJoined;
	}

	@Override
	public String toString() {
		return "StaffDTO [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", email=" + email
				+ ", isSuperUser=" + isSuperUser + ", isStaff=" + isStaff + ", lastLogin=" + lastLogin + ", dateJoined="
				+ dateJoined + "]";
	}

}
