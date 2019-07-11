package com.mijing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.mijing.config.CorsFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.mijing.mapper")
public class DemoApplication {

//	//入口类注册Filter 相当于？@WebFilter(urlPatterns = "/*", filterName = "CorsFilter")
//	@Bean //将方法中返回的对象注入到IOC容器中
//	public FilterRegistrationBean filterRegiste(){
//		FilterRegistrationBean reFilter = new FilterRegistrationBean();
//		reFilter.setFilter(new CorsFilter()); //创建并注册CorsFilter
//		reFilter.addUrlPatterns("/*"); //拦截的路径（对所有请求拦截）
//		reFilter.setName("CorsFilter"); //拦截器的名称
//		reFilter.setOrder(1); //拦截器的执行顺序。数字越小越先执行
//		return  reFilter;
//	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("============启动完毕=============");
	}
}
//	public static void main(String[] args) {
//		SpringApplication app=new SpringApplication(OssServerApplication.class);
//		//banner关闭
//		//app.setBannerMode(Banner.Mode.OFF);
//		app.run(args);
//		logger.info("程序启动完毕");
//		System.out.println("============启动完毕=============");