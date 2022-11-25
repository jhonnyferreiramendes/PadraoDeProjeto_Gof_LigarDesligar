
public class LigthOnCommand implements Command {
	
	SmartHouseLigth smartHouseLigth;
	
	
	public LigthOnCommand(SmartHouseLigth smartHouseLigth) {
		this.smartHouseLigth = smartHouseLigth;
		
	}

	@Override
	public void execute() {
		smartHouseLigth.on();
		
	}

	@Override
	public void undo() {
		smartHouseLigth.off();
	}

}
