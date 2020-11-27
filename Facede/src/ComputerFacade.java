
public class ComputerFacade {

	private final CPU processori;
	private final Memory ram;
	private final HardDrive hd;

	private static final int BOOT_ADDRESS = 0;
	private static final int BOOT_SECTOR = 0;
	private static final int SECTOR_SIZE = 1024;

	public ComputerFacade() {
		this.ram = new Memory();
		this.hd = new HardDrive();
		this.processori = new CPU(ram);
	}

	public void start() {
		processori.freeze();
		ram.Load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE), SECTOR_SIZE);
		processori.jump(BOOT_ADDRESS);

		System.out.println(" Loaded boot sequence. Starting execution (bytes that are executed): ");
		for (int i = 0; i < SECTOR_SIZE; ++i) {
			processori.execute();
			if (i % 16 == 0 && i > 0) {
				System.out.println("\n");
			}
		}
	}

}
