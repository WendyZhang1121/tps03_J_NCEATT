package tps03_J_NCEATT;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

final class PoolService {

	private final ExecutorService pool = Executors.newFixedThreadPool(10);
	

	public void doSomething() { 
		pool.execute(new Task());
	} 
	
	public static void main(String[] args) throws InterruptedException, IOException {
		PoolService service = new PoolService();
		service.doSomething();
	}
}

