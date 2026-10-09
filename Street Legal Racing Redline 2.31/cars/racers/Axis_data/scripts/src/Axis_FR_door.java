package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_FR_door extends FrontDoor
{
	public Axis_FR_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis stock passenger's door";
		description = "The stock passenger's door for Axis models.";

		value = tHUF2USD(65.832);
		brand_new_prestige_value = 41.47;
	}

}
