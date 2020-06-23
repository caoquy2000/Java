package data;

public class Square extends Rectangle{
	protected String smile;
	
	public Square(String name, String color,String smile, double edge) {
		super(name, color, edge, edge);
		this.smile = smile;
	}
	public String getSmile() {
		return smile;
	}
	public void setSmile(String smile) {
		this.smile = smile;
	}
	
	@Override
	public void paint() {
		System.out.printf("SQUARE    |%-10s|%-10s|%-4.1f|%-4.1f|%-6.2f|%-6.2f\n",
				name,color,width,length,getArea(),getPerimeter());
	}
	
	//Hàm này cha không có con làm riêng
	
	public void drawTextTitle() {
		System.out.println("=|-|-|=|=|-" + smile);
	}
}
