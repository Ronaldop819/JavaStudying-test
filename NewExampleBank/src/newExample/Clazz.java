package newExample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Clazz {

	private Lock lock = new ReentrantLock();
	
	public void method() {
		
		try {
			
		} finally {
			lock.unlock();
		}
	}
	
}
