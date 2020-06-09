package cn.ink;

import cn.printer.Paper;

public class TextPaper implements Paper {
	//每一行能输出的字符数
	private int charPerLine=16;
	//每页的行数
	private int linePerPage=8;
	//当前的横向位置，从0位到charPerLine-1
	private int posx=0;
	private int posy=0;
	private int posp=1;
	private String content="";
	
	
	public void PutInChar(char c) {
		content +=c;
		++posx;
		//判断是否跨行
		if(posx==charPerLine){
			content +=Paper.newLine;
			posx=0;
			++posy;
		}
		if(posy==linePerPage){
			content+="==第"+posp+"页==";
			content+=Paper.newLine+Paper.newLine;
			posy=0;
			++posp;
			
	}
	}
	
	public String getContent() {
		String ret=content;
		if(!(posx==0 && posy==0)){
			int count=linePerPage-posy;
			for(int i=0;i<count; i++){
				ret+=Paper.newLine;
		}   
			ret +="==第"+posp+"页==";
		}	
		return ret;		
	}

	public int getCharPerLine() {
		return charPerLine;
	}

	public void setCharPerLine(int charPerLine) {
		this.charPerLine = charPerLine;
	}

	public int getLinePerPage() {
		return linePerPage;
	}

	public void setLinePerPage(int linePerPage) {
		this.linePerPage = linePerPage;
	}

	public int getPosx() {
		return posx;
	}

	public void setPosx(int posx) {
		this.posx = posx;
	}

	public int getPosy() {
		return posy;
	}

	public void setPosy(int posy) {
		this.posy = posy;
	}

	public int getPosp() {
		return posp;
	}

	public void setPosp(int posp) {
		this.posp = posp;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
