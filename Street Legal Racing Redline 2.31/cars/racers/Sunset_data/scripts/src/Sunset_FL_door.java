package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_FL_door extends FrontDoor
{
	public Sunset_FL_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset stock driver's door";
		description = "Stock driver's door for Sunset models.";

		value = tHUF2USD(71.318);
		brand_new_prestige_value = 41.47;
	}
}
