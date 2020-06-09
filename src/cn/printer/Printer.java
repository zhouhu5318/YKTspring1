package cn.printer;


//打印机类
public class Printer {
	//面向接口编程，定义Ink接口变量
	  private ink ink;    //把ink墨盒对象作为打印机的属性
	//面向接口编程，定义paper接口变量 
	  private Paper paper;   //把paper对象作为打印机的属性
	  	  
	  //提供两个属性的set方法，以进行设置注入
	public void setInk(ink ink) {
		this.ink = ink;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	 public void Print(String str){
		 System.out.println("使用"+ink.getColor(255, 200, 0)+"颜色打印\n");
		 for(int i=0;i<str.length();i++){
		 paper.PutInChar(str.charAt(i));
		
}	System.out.println(paper.getContent()); 
}
}
