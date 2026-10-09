package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Duhen_FR_butterfly_door extends FrontDoor
{
	public Duhen_FR_butterfly_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Duhen SunStrip butterfly passenger's door";

		description = "The stock butterfly type passenger's door for all SunStrips.";

		value = tHUF2USD(102.124);
		brand_new_prestige_value = 35.12;
		setMaxWear(kmToMaxWear(285000));
	}
}
