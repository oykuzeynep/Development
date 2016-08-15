package book;

public class EBook extends Book{

	private double fileSize;
	private String encodingFormat;
	private int numDevicesBeingUsed = 0;
	
	
	public EBook(String name, String author, String bookId, double price, double fileSize, String encodingFormat) {
		super(name, author, bookId, price);
		this.fileSize = fileSize;
		this.encodingFormat = encodingFormat;
	}
	
	public double getFileSize() {
		return fileSize;
	}
	public void setFileSize(double fileSize) {
		this.fileSize = fileSize > 0 ? fileSize : 1.0;
	}
	public String getEncodingFormat() {
		return encodingFormat;
	}
	public void setEncodingFormat(String encodingFormat) {
		this.encodingFormat = encodingFormat;
	}

	public int getNumDevicesBeingUsed() {
		return numDevicesBeingUsed;
	}
	public void setNumDevicesBeingUsed(int numDevicesBeingUsed) {
		this.numDevicesBeingUsed = numDevicesBeingUsed;
	}
	
	public boolean addDevice() {
		return true;
	}
	
	public boolean removeDevice() {
		if(numDevicesBeingUsed <= 0)
			return false;
		return true;
		
	}
    public String toString(){
        String res = super.toString() +
                "Book file size: " + this.getFileSize() + "\n" +
                "Number of devices the book is being used on: " + this.getNumDevicesBeingUsed() + "\n";
        return res;
}
	
	
	

}
