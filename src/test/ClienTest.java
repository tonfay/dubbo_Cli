package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.provider.DemoService;

public class ClienTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"file:D:/workspace_neon/Dubbo-Consumer/src/dubbo-consumer.xml");
		context.start();
		DemoService testAPI = (DemoService) context.getBean("demoService"); // 获取远程服务代理
		System.out.println(testAPI.sayHello("123"));// 执行远程方法
	}
}
