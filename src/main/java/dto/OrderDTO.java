package dto;

import java.sql.Date;

public class OrderDTO {
	private int id;
	private int staffID;
	private int customerID;
	private int status;
	private String currency;
	private float shippingPrice;
	private String description;
	private Date createTime;
	private Date updateTime;

	public OrderDTO() {
	}

	public OrderDTO(int id, int staffID, int customerID, int status, String currency, float shippingPrice,
			String description, Date createTime, Date updateTime) {
		this.id = id;
		this.staffID = staffID;
		this.customerID = customerID;
		this.status = status;
		this.currency = currency;
		this.shippingPrice = shippingPrice;
		this.description = description;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStaffID() {
		return staffID;
	}

	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public float getShippingPrice() {
		return shippingPrice;
	}

	public void setShippingPrice(float shippingPrice) {
		this.shippingPrice = shippingPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
		return "OrderDTO [id=" + id + ", staffID=" + staffID + ", customerID=" + customerID + ", status=" + status
				+ ", currency=" + currency + ", shippingPrice=" + shippingPrice + ", description=" + description
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

}
