package com.example.demo;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.spockframework.runtime.Sputnik;

@RunWith(PowerMockRunner.class)
@PrepareForTest(CommonUtils.class)
public class DemoApplicationTest {

	@Test
	public void contextLoads() {
		PowerMockito.mockStatic(CommonUtils.class);
		PowerMockito.when(CommonUtils.generation()).thenReturn(1);
		Assert.assertEquals(1,CommonUtils.generation());
	}




}
