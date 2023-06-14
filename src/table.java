import java.util.ArrayList;
import java.util.Arrays;
public class table {
	private  char x1,x2,x3,x4,x5,x6,x7,x8,x9;
	
	private int[][] win_sets;
	public ArrayList<Integer> stic = new ArrayList<>();
	private ArrayList<Integer> p1_list = new ArrayList<>();
	private ArrayList<Integer> p2_list = new ArrayList<>();
	public String winner_name;
	public boolean winner;

	
	public String get_winner_name() {
		return winner_name;
	}
	
	public table() {
		 x1='-';
		 x2='-';
		 x3='-';
		 x4='-';
		 x5='-';
		 x6='-';
		 x7='-';
		 x8='-';
		 x9='-';
		 winner_name="Tie";
		 winner=false;
		 stic = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		 win_sets = new int[][] {
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9},
			    {1, 4, 7},
			    {2, 5, 8},
			    {3, 6, 9},
			    {1, 5, 9},
			    {7, 5, 3}};
	
		 }


	public void place(int z,char x) {
	
		if (stic.contains(z)) {
			int r=stic.indexOf(z);
			stic.remove(r);
			switch (z) {
			case 7 : {x1=x; break;}
			case 8 : {x2=x; break;}
			case 9 : {x3=x; break;}
			case 4 : {x4=x; break;}
			case 5 : {x5=x; break;}
			case 6 : {x6=x; break;}
			case 1 : {x7=x; break;}
			case 2 : {x8=x; break;}
			case 3 : {x9=x; break;}
			default: {System.out.println("Wrong button"); break;}}
			append(z,x);
			if (x==play_state.p1.get_ch()) {play_state.p_turn=play_state.p2.get_name();}
			if (x==play_state.p2.get_ch()) {play_state.p_turn=play_state.p1.get_name();}
					}
		else
			System.out.println("\nBlocked By another Player , Please Re-Entter");
			update();
		
	}
	
	private void append(int z,char x) {
		if (x=='x')
			p1_list.add(z);
		else
			p2_list.add(z);
		
	}
	
	public void chek_for_win() {
		for (int i = 0; i < win_sets.length; i++) {
			ArrayList<Integer> xlis = new ArrayList<>();
		    for (int j = 0; j < win_sets[i].length; j++) {
		    	xlis.add(win_sets[i][j]);
		    	}

		    if (p1_list.containsAll(xlis)){
		 
		    	 winner_name=play_state.p1.get_name();
		    	 winner=true;}
		    
		    if (p2_list.containsAll(xlis)){
		  
		    	 winner_name=play_state.p2.get_name();
		    	 winner=true;}
		    }
	}

	

	private  void update() {
		chek_for_win();

		System.out.println("*------------------*\n"
				 		+ "|  "+x1+"   |  "+x2+"  |  "+x3+"  |\n"
				 		+ "|------|-----|-----|\n"
				 		+ "|  "+x4+"   |  "+x5+"  |  "+x6+"  |\n"
				 		+ "|------|-----|-----|\n"
				 		+ "|  "+x7+"   |  "+x8+"  |  "+x9+"  |\n"
				 		+ "*------------------*\n");


	};
}
