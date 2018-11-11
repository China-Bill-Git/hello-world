package com.wangheng.configration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/**
 * .properties 配置文件测试
 * @author wangheng
 * @sience 2018年10月8日 下午9:55:33
 */
@Component
public class PersionProperties {

	@Value("${com.wangheng.name}")
	private String name;
	
	@Value("${com.wangheng.sex}")
	private String sex;
	
	@Value("${com.wangheng.desc}")
	private String desc;
	
	@Value("${com.wangheng.value}")
	private String value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
