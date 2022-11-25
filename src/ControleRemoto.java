
public class ControleRemoto {
	
	Command slot;
	
	public ControleRemoto() {
		
	}
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public  void executeCommand() {
		slot.execute();
	}
	
	public void undoCommand() {
		slot.undo();
	}

}
