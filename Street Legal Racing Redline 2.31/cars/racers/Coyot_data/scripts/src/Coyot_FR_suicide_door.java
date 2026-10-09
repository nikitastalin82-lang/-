package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_FR_suicide_door extends FrontDoor
{
	public Coyot_FR_suicide_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot suicide passenger's door";
		description = "Suicide type passenger's door for Coyot models.";

		value = tHUF2USD(112.197);
		brand_new_prestige_value = 59.12;
	}
}
