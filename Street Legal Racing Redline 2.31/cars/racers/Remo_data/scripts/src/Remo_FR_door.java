package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_FR_door extends FrontDoor
{
	public Remo_FR_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo stock passenger's door";
		description = "Stock passenger's door for Remo models.";

		value = tHUF2USD(79.547);
		brand_new_prestige_value = 41.47;
	}
}
