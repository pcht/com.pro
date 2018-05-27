package dto;

import java.sql.Date;

public class BrandDTO {
	private int id;
	private String name;
	private String image;
	private int status;
	private String description;
	private Date createTime;
	private Date updateTime;

	public BrandDTO() {
	}

	public BrandDTO(int id, String name, String image, int status, String description, Date createTime,
			Date updateTime) {
		this.id = id;
		this.name = name;
		this.image = image;
		this.status = status;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "BrandDTO [id=" + id + ", name=" + name + ", image=" + image + ", status=" + status + ", description="
				+ description + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

}
