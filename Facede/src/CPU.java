
public class CPU {
	int ip = 0;
	boolean running = false;

	Memory memory;

	public CPU(Memory memory) {
		this.memory = memory;
	}

	public void freeze() {
		running = false;
	}

	public void jump(int position) {
		ip = position;
	}

	public void execute() {
		byte NextByte = memory.getByte(ip);
		ip++;
		System.out.println(String.format("%2X", Byte.toUnsignedInt(NextByte)) + " ");
	}

}
