/**
 * 
 */

/**
 * @author ali_r
 *
 */
public class Singleton {
	
	public static void main(String[] args) {
		
		ISingleton ekasingleton = SingletonClass.INSTANCE;
		ekasingleton.Singleton1();
		ekasingleton.Singleton2();
		ekasingleton.setSingleton("Jotain muutoksia on tapahtunut.");
		
		ISingleton tokaSingleton = SingletonClass.INSTANCE;
		tokaSingleton.Singleton2();
		tokaSingleton.Singleton1();
		
		tokaSingleton.setSingleton("Jotain muutoksia on tapahtunut.");
		
		ISingleton kolmasSingleton = SingletonClass.INSTANCE;
		kolmasSingleton.Singleton2();
		kolmasSingleton.Singleton1();
	}

}
