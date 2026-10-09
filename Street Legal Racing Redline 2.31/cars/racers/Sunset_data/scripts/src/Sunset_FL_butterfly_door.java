package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_FL_butterfly_door extends FrontDoor
{
	public Sunset_FL_butterfly_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset butterfly driver's door";
		description = "Butterfly trype driver's door for Sunset models.";

		value = tHUF2USD(104.200);
		brand_new_prestige_value = 66.13;
	}
}
