package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_FL_door extends FrontDoor
{
	public Remo_FL_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo stock driver's door";
		description = "Stock driver's door for Remo models.";

		value = tHUF2USD(79.547);
		brand_new_prestige_value = 41.47;
	}
}
