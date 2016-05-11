package EnemyShipTesting;

public abstract class EnemyShip
{
    private double damage_amount;
    private String ship_name;
    

    public void set_name(String name_main)
    {
        ship_name = name_main;
    }

    public String get_name()
    {
        return ship_name;
    }

    public void set_damage(double damage_main)
    {
        damage_amount = damage_main;
    }

    public double get_damage()
    {
        return damage_amount;
    }

    public void follow_hero_ship()
    {
        System.out.println(get_name() + " is after the hero ship");
    }

    public void display_enemy_ship()
    {
        System.out.println(get_name() + " is on the screen");
    }

    public void do_attack()
    {
        System.out.println(get_name() + " attacked and caused " + get_damage() + " damage");
    }
    
}
