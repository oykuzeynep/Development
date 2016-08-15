package file;

import java.util.Date;

public abstract class BinaryFile extends file{
	
	public BinaryFile(long size, String name) {
		super(size, name);
	}

	public abstract BinaryFile getCopy();

	
}
