package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Duhen_FL_scissor_door extends FrontDoor
{
	public Duhen_FL_scissor_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Duhen SunStrip scissor driver's door";

		description = "The stock scissor type driver's door for all SunStrips.";

		value = tHUF2USD(132.124);
		brand_new_prestige_value = 35.12;
		setMaxWear(kmToMaxWear(285000));
	}
}
