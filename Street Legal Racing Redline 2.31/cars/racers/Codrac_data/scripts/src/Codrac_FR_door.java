package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_FR_door extends FrontDoor
{
	public Codrac_FR_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac stock passenger's door";
		description = "Stock passenger's door for Codrac models.";

		value = tHUF2USD(83.978);
		brand_new_prestige_value = 41.47;
	}
}
