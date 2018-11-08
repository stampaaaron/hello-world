public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("wunderschöne software");
	}

	private int i;
	private String text;
	public HelloWorld() {
		i = 0;
	}
	public HelloWorld(String message) {
		System.out.println(message);
	}

	public int getI() {
		return this.i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
