package cn.printer;

public interface Paper {
	public static final String newLine="\r\n";
    //往纸张里面逐个字符输出类容
	public void PutInChar(char c);
	//得到输出到纸张中的内容
	public String getContent();
}
