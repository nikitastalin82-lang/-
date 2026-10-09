package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_FR_butterfly_door extends FrontDoor
{
	public Remo_FR_butterfly_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo butterfly passenger's door";
		description = "Butterfly type passenger's door for Remo models.";

		value = tHUF2USD(96.173);
		brand_new_prestige_value = 49.64;
	}
}
