
public class Memory {
	private byte ram[] = new byte[4096];

	public void Load(int position, byte[] data, int size) {
		if (position + size > ram.length) {
			System.out.println("Out of memory");
			return;
		}

		for (int i = position; i < (position + size); ++i) {
			ram[i] = data[i];
		}
	}

	public byte getByte(int address) {
		return ram[address];
	}
}
