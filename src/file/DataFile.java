package file;

public class DataFile extends BinaryFile implements Openable{
	private String compressionFormat;
	private ExecutableFile opensWith;
	private boolean[] bits;
	

	
    public DataFile(long size, String name, String compressionFormat, ExecutableFile opensWith, boolean[] bits) {
		super(size, name);
		this.compressionFormat = compressionFormat;
		this.opensWith = opensWith;
		this.bits = bits;
	}

	@Override
	public void onClick() {
		if(opensWith.getName().equals("vlc.run") && (getName().endsWith(".flac") || getName().endsWith(".mkv")))
			System.out.println("vlc.run " + getName());
		
	}

	@Override
	public String opensWith() {
		// TODO Auto-generated method stub
		return this.opensWith.getName();
	}

	@Override
	public BinaryFile getCopy() {
		// TODO Auto-generated method stub
		return null;
	}




	
}



