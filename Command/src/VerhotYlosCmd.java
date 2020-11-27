
public class VerhotYlosCmd implements ICommand {

	private Verhot verhot;

	public VerhotYlosCmd(Verhot verhot) {
		this.verhot = verhot;
	}

	public void execute() {
		verhot.verhotYlos();
	}
}
