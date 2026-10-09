package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_FR_suicide_door extends FrontDoor
{
	public Sunset_FR_suicide_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset suicide passenger's door";
		description = "Suicide type passenger's door for Sunset models.";

		value = tHUF2USD(129.196);
		brand_new_prestige_value = 66.13;
	}
}
