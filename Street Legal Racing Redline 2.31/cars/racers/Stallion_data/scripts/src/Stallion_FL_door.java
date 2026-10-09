package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_FL_door extends FrontDoor
{
	public Stallion_FL_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion stock driver's door";
		description = "Stock driver's door for Stallion models.";

		value = tHUF2USD(71.318);
		brand_new_prestige_value = 41.47;
	}
}
