package EnemyShipTesting;

import java.util.Scanner;

public class EnemyShipTesting
{

    public static void main(String[] args)
    {
        
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip enemy_ship = null;
        
        Scanner in = new Scanner(System.in);

        System.out.println("What type of ship do you want to make?(UFO/Rocket/Big UFO)");
        System.out.println("press U for UFO, R for Rocket, B for BigUFO");
        
        String  enemy_ship_name;

        if(in.hasNextLine())
        {
            enemy_ship_name = in.nextLine();
            enemy_ship = shipFactory.makeEnemyShip(enemy_ship_name);
        }
        

        if(enemy_ship != null)
        {
            do_stuff(enemy_ship);
        }
        else
        {
            System.out.println("Please, Enter U,R or B");
        }
        
    }
    
    
    public static void do_stuff(EnemyShip enemy_ship)
    {
        enemy_ship.display_enemy_ship();
        enemy_ship.follow_hero_ship();
        enemy_ship.do_attack();
    }
    
    
}
