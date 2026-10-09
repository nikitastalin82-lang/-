package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_FR_butterfly_door extends FrontDoor
{
	public Coyot_FR_butterfly_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot butterfly passenger's door";
		description = "Butterfly type passenger's door for Coyot models.";

		value = tHUF2USD(101.387);
		brand_new_prestige_value = 59.12;
	}
}
