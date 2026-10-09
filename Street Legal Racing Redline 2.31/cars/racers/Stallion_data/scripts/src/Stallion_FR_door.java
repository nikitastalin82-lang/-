package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_FR_door extends FrontDoor
{
	public Stallion_FR_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion stock passenger's door";
		description = "Stock passenger's door for Stallion models.";

		value = tHUF2USD(71.318);
		brand_new_prestige_value = 41.47;
	}
}
