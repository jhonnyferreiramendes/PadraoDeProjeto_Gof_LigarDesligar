
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartHouseLigth smartHouseLigth = new SmartHouseLigth("Luz Quarto ");
		
		LigthOnCommand ligthOnCommand = new LigthOnCommand(smartHouseLigth);
		
		ligthOnCommand.execute();
		
		ligthOnCommand.undo();
		
		ControleRemoto controleRemoto = new ControleRemoto();
		
		controleRemoto.setCommand(ligthOnCommand);
		controleRemoto.executeCommand();
		controleRemoto.undoCommand();
		controleRemoto.executeCommand();

	}

}
