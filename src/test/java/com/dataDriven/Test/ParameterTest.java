package com.dataDriven.Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	@Test
	@Parameters({"gautam"})
	public void parameter(String gautam) {
		System.out.println(gautam);
		
		
	}

}
