
public class VerhoKytkin {
	ICommand cmd;

	public VerhoKytkin(ICommand cmd) {
		this.cmd = cmd;
	}

	public void paina() {
		cmd.execute();
	}

}
