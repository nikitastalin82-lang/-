package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_FR_butterfly_door extends FrontDoor
{
	public Badge_FR_butterfly_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge butterfly passenger's door";
		description = "Butterfly type passenger's door for Badge models.";

		value = tHUF2USD(102.821);
		brand_new_prestige_value = 56.12;
	}
}
