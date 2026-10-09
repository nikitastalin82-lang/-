package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_FL_suicide_door extends FrontDoor
{
	public Sunset_FL_suicide_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset suicide driver's door";
		description = "Suicide type driver's door for Sunset models.";

		value = tHUF2USD(129.196);
		brand_new_prestige_value = 66.13;
	}
}
