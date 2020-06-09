package cn.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.printer.Printer;

public class PrinterTest {
	@Test
	public void test(){
		ApplicationContext context=new
				ClassPathXmlApplicationContext("ApplicationContext.xml");
		Printer printer=(Printer)context.getBean("printer");  //拿到xml里id="printer"的bean元素强转为Printer类型
		String content="控制反转，本来对象是需要你的程序自己创建的，有了IOC你可以把不用再。。。。";
		printer.Print(content);  //此时的printer就相当于Printer类的对象，且已经赋好纸张和颜色墨盒属性值好了。在调用它本类的方法，打印文本。
		
		
			
}
}
