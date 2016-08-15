package file;

import java.util.List;

public class HTMLFile extends TextFile implements Openable{
	private int htmlVersion;
	private List<HTMLFile> linksTo;
	ExecutableFile browserCompatibleWith;
	
	

	
	public HTMLFile(String name, long size, String encoding, int htmlVersion,
			ExecutableFile browserCompatibleWith, List<HTMLFile> linksTo) {
		super(size, name, encoding);
		this.htmlVersion = htmlVersion;
		this.linksTo = linksTo;
		this.browserCompatibleWith = browserCompatibleWith;
	}

	@Override
	public void clear() {
		browserCompatibleWith = new ExecutableFile(getNumChars(), "firefox.run", getEncoding(), null);	
		linksTo.clear();

	}

	@Override
	public String opensWith() {
		// TODO Auto-generated method stub
		return "firefox.run";
	}

	@Override
	public void onClick() {
		HTMLFile index = new HTMLFile(getName(), getSize(), getEncoding(), htmlVersion, browserCompatibleWith, linksTo);
		System.out.println("firefox.run " + index);
	}
	
	

}
