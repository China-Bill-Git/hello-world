package com.wangheng;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wangheng.configration.PersionProperties;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTest {

	@Autowired
	private PersionProperties persionProperties;
	
	@Test
	public void testProperties() throws Exception{
		Assert.assertEquals(persionProperties.getName(), "王恒");
		Assert.assertEquals(persionProperties.getSex(), "男");
		Assert.assertEquals(persionProperties.getDesc(), "王恒是个大帅哥");
		
		System.err.println("随机字符串"+ persionProperties.getValue());
	}
	
}
