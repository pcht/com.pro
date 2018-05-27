package dto;

import java.sql.Date;

public class StaffDTO {
	private int id;
	private int accountID;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String identification;
	private String country;
	private String location;
	private String district;
	private int gender;
	private Date birthday;
	private String image;
	private int status;
	private Date createTime;
	private Date updateTime;

	public StaffDTO() {
	}

	public StaffDTO(int id, int accountID, String firstName, String lastName, String phone, String email,
			String identification, String country, String location, String district, int gender, Date birthday,
			String image, int status, Date createTime, Date updateTime) {
		this.id = id;
		this.accountID = accountID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.identification = identification;
		this.country = country;
		this.location = location;
		this.district = district;
		this.gender = gender;
		this.birthday = birthday;
		this.image = image;
		this.status = status;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "StaffDTO [id=" + id + ", accountID=" + accountID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phone=" + phone + ", email=" + email + ", identification=" + identification + ", country="
				+ country + ", location=" + location + ", district=" + district + ", gender=" + gender + ", birthday="
				+ birthday + ", image=" + image + ", status=" + status + ", createTime=" + createTime + ", updateTime="
				+ updateTime + "]";
	}

}
