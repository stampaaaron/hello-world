public class HelloWorld {
	private int i;
	public HelloWorld(String text) {
		i = 0;
		this.text = text;
		System.out.println(text);
	}
	
	public int getI() {
		return this.i;
	
	}

	public void setI(int i) {
		this.i = i;
	}
}
