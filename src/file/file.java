package file;

import java.util.Date;

public abstract class file {

	private long size;
	private String name;
	private Date dateCreated;
	
	
	
	public file(long size, String name) {
		this.size = size;
		this.name = name;
	}

	public abstract void onClick();


	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		return "file [size=" + size + ", name=" + name + ", dateCreated=" + dateCreated + "]";
	}

	

	
	
}
