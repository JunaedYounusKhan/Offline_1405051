package EnemyShipTesting;

public class EnemyShipFactory
{
    
    public EnemyShip makeEnemyShip(String EnemyShipName)
    {
        EnemyShip newShip = null;
        
        if(EnemyShipName.equals("U"))
        {
            newShip = new UFOEnemyShip();
        } else
        if(EnemyShipName.equals("R"))
        {
            newShip = new RocketEnemyShip();
        } else 
        if(EnemyShipName.equals("B"))
        {
            newShip = new BigUFOEnemyShip();
        }
        
        return newShip;
    
    }

}
