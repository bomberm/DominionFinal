package org.cs362.dominion;

import org.junit.Test;

public class RunSeveralTimes {
	String[] args = null;
	
	@Test
	public void test() {
		for(int i=0; i<1000; i++){
			RandomTestDominion.main(args);
		}
	}

}
