package dto;

import java.sql.Date;

public class ProductDTO {
	private int id;
	private String productCode;
	private String name;
	private String currency;
	private float basePrice;
	private float discount;
	private String image;
	private int categoryID;
	private int stock;
	private int priority;
	private int availability;
	private Date createTime;
	private Date updateTime;

	public ProductDTO() {
	}

	public ProductDTO(int id, String productCode, String name, String currency, float basePrice, float discount,
			String image, int categoryID, int stock, int priority, int availability, Date createTime, Date updateTime) {
		this.id = id;
		this.productCode = productCode;
		this.name = name;
		this.currency = currency;
		this.basePrice = basePrice;
		this.discount = discount;
		this.image = image;
		this.categoryID = categoryID;
		this.stock = stock;
		this.priority = priority;
		this.availability = availability;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public float getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(float basePrice) {
		this.basePrice = basePrice;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
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
		return "ProductDTO [id=" + id + ", productCode=" + productCode + ", name=" + name + ", currency=" + currency
				+ ", basePrice=" + basePrice + ", discount=" + discount + ", image=" + image + ", categoryID="
				+ categoryID + ", stock=" + stock + ", priority=" + priority + ", availability=" + availability
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

}
