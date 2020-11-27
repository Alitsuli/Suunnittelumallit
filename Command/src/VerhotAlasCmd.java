
public class VerhotAlasCmd implements ICommand {
	private Verhot verhot;

	public VerhotAlasCmd(Verhot verhot) {
		this.verhot = verhot;
	}

	public void execute() {
		verhot.verhotAlas();
	}

}
