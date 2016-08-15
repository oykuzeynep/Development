package file;

import java.util.Date;

public class ExecutableFile extends BinaryFile{


	private String platform;
	
	private byte[] contents;
	
	

	public ExecutableFile(long size, String name, String platform, byte[] contents) {
		super(size, name);
		this.platform = platform;
		this.contents = contents;
	}


	@Override
	public void onClick() {
	    if(getName().equals("winamp"))
			System.out.println("winamp");
		
	}


	@Override
	public BinaryFile getCopy() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
