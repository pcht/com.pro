package dto;

public class OrderInformationDTO {
	private int id;
	private int orderID;
	private int productID;
	private float basePrice;
	private float price;
	private float discount;
	private int quantity;

	public OrderInformationDTO() {
	}

	public OrderInformationDTO(int id, int orderID, int productID, float basePrice, float price, float discount,
			int quantity) {
		this.id = id;
		this.orderID = orderID;
		this.productID = productID;
		this.basePrice = basePrice;
		this.price = price;
		this.discount = discount;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public float getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(float basePrice) {
		this.basePrice = basePrice;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderInfoDTO [id=" + id + ", orderID=" + orderID + ", productID=" + productID + ", basePrice="
				+ basePrice + ", price=" + price + ", discount=" + discount + ", quantity=" + quantity + "]";
	}

}
