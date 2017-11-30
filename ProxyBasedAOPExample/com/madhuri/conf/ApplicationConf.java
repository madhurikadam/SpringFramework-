package com.madhuri.conf;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.madhuri.Audience;
import com.madhuri.Guitar;
import com.madhuri.Instrument;
import com.madhuri.Instrumentalist;

@Configuration
public class ApplicationConf {
	
	@Bean(name="guitar")
	public Instrument getGuitar(){
		return new Guitar();
	}
	@Bean(name="target")
	public Instrumentalist getInst()
	{
		Instrumentalist  ls = new Instrumentalist();
		ls.setIm(getGuitar());
		return ls ;
	}
	@Bean(name="audience")
	public Audience getAug(){
		return new Audience();
		
	}
	@Bean(name="proxy")
	public ProxyFactoryBean getProxy(){
		
		 ProxyFactoryBean pr = new ProxyFactoryBean();
		 pr.setTarget(getInst());
		 pr.setInterceptorNames("audience");
		 return pr;
	}
}
