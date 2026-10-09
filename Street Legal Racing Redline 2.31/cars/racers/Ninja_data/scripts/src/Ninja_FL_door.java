package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_FL_door extends FrontDoor
{
	public Ninja_FL_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja stock driver's door";
		description = "Stock driver's door for Ninja models.";

		value = tHUF2USD(42.411);
		brand_new_prestige_value = 41.47;
	}
}
