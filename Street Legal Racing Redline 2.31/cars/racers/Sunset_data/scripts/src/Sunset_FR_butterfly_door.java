package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_FR_butterfly_door extends FrontDoor
{
	public Sunset_FR_butterfly_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset butterfly passenger's door";
		description = "Butterfly type passenger's door for Sunset models.";

		value = tHUF2USD(104.200);
		brand_new_prestige_value = 66.13;
	}
}
