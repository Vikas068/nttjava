package com.nttdata;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {

	
	public static void main(String[] args) {
		
		
		ExecutorService es=Executors.newCachedThreadPool();
		
		//es.execute(new ExampleRunnable("one"));
		es.shutdown();
	}
}
