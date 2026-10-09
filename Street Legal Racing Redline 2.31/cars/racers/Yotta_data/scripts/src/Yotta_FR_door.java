package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_FR_door extends FrontDoor
{
	public Yotta_FR_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta stock passenger's door";
		description = "Stock passenger's door for Yotta models.";

		value = tHUF2USD(86.932);
		brand_new_prestige_value = 41.47;
	}
}
