/**
 * 
 */

/**
 * @author ali_r
 *
 */
public enum SingletonClass  implements ISingleton{
	
	INSTANCE;
	
	private String singleton = "singlenton";
	
	public void Singleton1() {
		System.out.println(singleton);
	}
	
	public void Singleton2() {
		System.out.println("Singleton 2");
	}
	
	public void setSingleton(String newSingleton) {
		singleton = newSingleton;
	}
	

}
