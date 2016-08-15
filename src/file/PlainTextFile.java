package file;

public class PlainTextFile extends TextFile{
	private String[] lines;

	
	public PlainTextFile(String name, long size, String encoding, String[] lines) {
		super(size, name, encoding);
		this.lines = lines;
	}

	@Override
	public void clear() {
		lines = new String[10];
		for(int i = 0 ; i< lines.length; i++) {
			lines[i] = "";
		}
	}

	@Override
	public void onClick() {
		for(int i = 0 ; i< lines.length; i++) {
		    System.out.println(lines[i]);
		}
				
	}
	

}
