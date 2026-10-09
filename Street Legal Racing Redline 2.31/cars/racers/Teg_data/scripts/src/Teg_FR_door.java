package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_FR_door extends FrontDoor
{
	public Teg_FR_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg stock passenger's door";
		description = "Stock passenger's door for Teg models.";

		value = tHUF2USD(53.594);
		brand_new_prestige_value = 41.47;
	}
}
