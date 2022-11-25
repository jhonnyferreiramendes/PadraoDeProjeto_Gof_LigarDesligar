
public class SmartHouseLigth {
	
	private boolean ison;
	
	private String nome;
	
	
	public SmartHouseLigth(String nome) {
		this.nome = nome;
	}
	
	public String getPowerStatus() {
		return this.ison? "ON" : "OFF";
	}
	
	public boolean on() {
		this.ison = true;
		System.out.println(this.nome + "esta" + this.getPowerStatus());
		return this.ison;
	}
	
	public boolean off() {
		this.ison = false;
		System.out.println(this.nome + "esta" + this.getPowerStatus());
		return this.ison;
	}

}
