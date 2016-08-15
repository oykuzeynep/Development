package lghlgh;

public class Replace {

	public static void main(String args[]) {
		String str = "Grapon Kağıtları";

		System.out.println(str.replace("Gr", "Ka"));
		System.out.println(str.replaceFirst("Gr", "Grr"));
		System.out.println(str.replaceAll("Gr", "Ha"));
	}
	
}
