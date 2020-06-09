package cn.ink;
import java.awt.Color;

import cn.printer.ink;

//彩色墨盒 实现ink类
public class ColorInk implements ink {
	public String getColor(int r, int g, int b) {
    Color color=new Color(r,g,b);
    return "#"+Integer.toHexString(color.getRGB()).substring(2);
	}

}
