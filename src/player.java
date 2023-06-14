
public class player {
	private char player_ch;
	private String name;
	
	
	public player() {
		player_ch='-';
		 name="Null";
		 System.out.println("Test");

	}
	
	public player(char ch,String name) {
		player_ch=ch;
		this.name=name;
	}
	public void set_name(String pname) {
		name=pname;
	}
	
	
	public char get_ch() {
		return player_ch;
	}
	
	public String get_name() {
		return name;
	}

}
