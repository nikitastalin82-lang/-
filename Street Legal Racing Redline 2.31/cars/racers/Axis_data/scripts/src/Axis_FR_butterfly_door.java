package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_FR_butterfly_door extends FrontDoor
{
	public Axis_FR_butterfly_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis butterfly passenger's door";
		description = "The butterfly type passenger's door for Axis models.";

		value = tHUF2USD(93.711);
		brand_new_prestige_value = 57.31;
	}

}
