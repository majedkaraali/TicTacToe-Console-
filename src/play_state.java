import java.util.Scanner;
public class play_state {
	public static table Taple;
	public static String p_turn;
	public static player p1,p2;
	private static Scanner input;
	public static  boolean quit=false;
	


	
	public static void main(String args[]) {
		System.out.print("\nGame By Majed");
		input=new Scanner(System.in);
		
		System.out.print("\nThe Game Board is like this Table Please focuse on the digts from 1 to 9 ");
		System.out.println("\n*------------------*\n"
							+ "|  7   |  8  |  9  |\n"
							+ "|------|-----|-----|\n"
							+ "|  4   |  5  |  6  |\n"
							+ "|------|-----|-----|\n"
							+ "|  1   |  2  |  3  |\n"
							+ "*------------------*\n");
		new_game();	
	}
	
	
	
	
	public static void new_game() {
		Taple= new table();
		System.out.print("\nPlayer 1  Please Enter a name! ");
		String p1name=input.next();
		System.out.print("\nPlayer 2  Please Enter a name! ");
		String p2name=input.next();

		
		p1= new player('x',p1name);
		p2= new player('o',p2name);
		p_turn=p1.get_name(); 
		while (quit != true) {

			if (Taple.winner==true) {
				End_game();
				break;}
			
			

	 
			

			System.out.print("\nThe Turn is For "+p_turn);
			System.out.print("\nEnter Your choise From 1 to 9 , For  Quit  0 :");
			int choise=input.nextInt();
			
			
			if (choise==0)
				{quit=true;
				
				End_game();
				break;}
			
			if (p_turn==p1.get_name())			
				Taple.place(choise,p1.get_ch());
			
			else if (p_turn==p2.get_name())			
				Taple.place(choise,p2.get_ch());
		
		}	
	}
	private static void End_game() {
		System.out.print("\nGame Ended \nThe Winner is "+Taple.get_winner_name());
		System.out.print("\nDo you want to Re-Play Enter , 1 for 'YES' /// 0 for 'NO' ");
		int rep =input.nextInt();
		System.out.print("\n***********************");
		if (rep==0)
			{System.out.print("\nEnd..");
			quit=true;
			}
		if (rep==1)
		{
			quit=false;
			new_game();}
		
	}
	
}
