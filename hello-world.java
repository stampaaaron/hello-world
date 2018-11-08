public class HelloWorld {
	private int i;

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
}
