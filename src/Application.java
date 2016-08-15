
public class Application {

	private static final Application INSTANCE; // Singleton design pattern, tek instance
	
	private Application() { } // yeniden üretilmemesi için private final
		
		public static Application setInstance() {
			if(INSTANCE == null)
				INSTANCE = new Application();
			return INSTANCE;
		}
	
}
