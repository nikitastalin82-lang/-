package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_FR_door extends FrontDoor
{
	public Sunset_FR_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset stock passenger's door";
		description = "Stock passenger's door for Sunset models.";

		value = tHUF2USD(71.318);
		brand_new_prestige_value = 41.47;
	}
}
