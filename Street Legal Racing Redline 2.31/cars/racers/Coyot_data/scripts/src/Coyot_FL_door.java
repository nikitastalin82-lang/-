package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_FL_door extends FrontDoor
{
	public Coyot_FL_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot stock driver's door";
		description = "Stock driver's door for Coyot models.";

		value = tHUF2USD(83.978);
		brand_new_prestige_value = 41.47;
	}
}
