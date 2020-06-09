package cn.ink;


import java.awt.Color;

import cn.printer.ink;

//灰色墨盒 实现ink类

public class GreyInk implements ink {	
	public String getColor(int r, int g, int b) {
		int c=(r+g+b)/3;
		Color color=new Color(c,c,c);
			
		return "#"+Integer.toHexString(color.getRGB()).substring(2);
	}

}
