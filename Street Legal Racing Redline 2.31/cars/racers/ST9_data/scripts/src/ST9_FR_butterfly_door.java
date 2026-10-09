package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_FR_butterfly_door extends FrontDoor
{
	public ST9_FR_butterfly_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 butterfly passenger's door";
		description = "Butterfly type passenger's door for ST9 models.";

		value = tHUF2USD(99.300);
		brand_new_prestige_value = 62.27;
	}
}
