package villainGame;
import java.util.*;
public class TextBasedVillainKilling {

		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			Random r=new Random();
			GAME:
				while(true) {
			int health=100;
			int maxeneemyHealth=80;
			int numOfDrink=4;
		     int enemiesC=0;
		     int p=0;
			String[] enemies= {"Warden Norton","VolderMort","Joker","Sauron","Thanos"};
			System.out.println("\t\tWelcome To The Game Of Villains!!!!\n");
			System.out.println("----------------------------------------------------------------------------------");
			while(enemiesC<enemies.length)
			{
				String enemy=enemies[enemiesC];
				enemiesC++;
				System.out.println("\n\n\t\t"+enemy+" Has Appeared!!!\n");
				int enemeyHealth=0;
				while(enemeyHealth<40) {
				 enemeyHealth=r.nextInt(maxeneemyHealth);
				}
				if(enemeyHealth>0)
				System.out.println("> "+enemy+" Health Is: "+enemeyHealth);
				System.out.println("> Your Health Is: "+health);
			while(enemiesC<enemies.length+1)
				{
					System.out.println("\n\t\t What would you like to do?\n");
					System.out.println("1.Attack");
					System.out.println("2.Drink Health Booster");
					System.out.println("3.Restart Game");
					System.out.println("4.Quit Game");
					if(health<enemeyHealth||health-enemeyHealth<5)
					{
						System.out.println("It will be too risky too attack now.It will be wise to use your drink boosters now.");
					}
					System.out.print("Enetr Your Choice: ");
					int c=sc.nextInt();
					if(c==1)
					{
						int damageHealth=r.nextInt(30);
						int enemydamageHealth=r.nextInt(40);
						health=health-damageHealth;
						enemeyHealth-=enemydamageHealth;
						if(enemeyHealth>0)
						System.out.println("\n> "+enemy+" Health Is: "+enemeyHealth);
						if(health>0)
						System.out.println("\n> Your Health Is: "+health);
						if(health<1&&health<enemeyHealth)
						{
							System.out.println("You Have Lost The Game. "+enemy+" Has Defeated You");
							System.out.println("----------------------------------------------------------------------------------");
							System.out.println("Would You Like To Restart The Game?.If Yes,then type 1 ");
						System.out.print("Enter Your Choice: ");
						int c1=sc.nextInt();
							if(c1==1)
							{
								continue GAME;
							}
							else
							{
								p=1;
								break;
							}
							
						}
						else if(enemeyHealth<1)
						{
							System.out.println("\t\tCongratulation!!!! You Have Defeated "+enemy+" successfully\n");
							if(health<50) {
								health+=20;
								System.out.println("\t\tYou have recieved +20 bonus Health for defeating "+enemy+"!!!\n");
								System.out.println("-------------------------------------------------------------------------------------------------------------");
							}
							else {
								numOfDrink++;
								System.out.println("\n\t\tYou have recieved an extra Drink Booster for defeating "+enemy+" so easily!!!.You have Now "+numOfDrink+" left");
								System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
								}
							break;
							
							
						}
					}
					else if(c==2)
					{
						if(numOfDrink>0)
						{
							health+=30;
							numOfDrink--;
							//System.out.println("> "+enemy+" Health Is: "+enemeyHealth);
							System.out.println("\n> Your Health Is: "+health);
							System.out.println("\n You have "+numOfDrink+" drink boosters left");
						}
						else
						{
							System.out.println("\n Sorry!!! You have no drink booster left");
						}
					}
					else if(c==3)
					{
						continue GAME;
					}
					else
					{
						p=1;
						break;
					}
					
				}
			if(p==1)
			{
				break;
			}
			else if(enemiesC==5)
			{
				if(health-enemeyHealth<10)
				{
					System.out.println("What a comeback!!!");
				}
				System.out.println("\t\tCongratulations!!! You Have Defeated One OF The Greatest Villains Of All Time!!\n");
			}
				
				
				
				
				
				
			}
			System.out.println("\nWhat Would You Like To Do Now??");
			System.out.println("1.Play Again");
			System.out.println("2.Quit");
			System.out.print("Enter Your Choice: ");
			int e=sc.nextInt();
			if(e==1)
			{
				continue GAME;
			}
			else
				break;
			
			
		}
	}

}
