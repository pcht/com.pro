package dto;

public class ProductInformationDTO {
	private int id;
	private int productID;
	private String manufacturer;
	private String design;
	private String size;
	private String color;
	private String origin;
	private int rating;
	private String description;

	public ProductInformationDTO() {
	}

	public ProductInformationDTO(int id, int productID, String manufacturer, String design, String size, String color,
			String origin, int rating, String description) {
		this.id = id;
		this.productID = productID;
		this.manufacturer = manufacturer;
		this.design = design;
		this.size = size;
		this.color = color;
		this.origin = origin;
		this.rating = rating;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ProductInformationDTO [id=" + id + ", productID=" + productID + ", manufacturer=" + manufacturer
				+ ", design=" + design + ", size=" + size + ", color=" + color + ", origin=" + origin + ", rating="
				+ rating + ", description=" + description + "]";
	}

}
