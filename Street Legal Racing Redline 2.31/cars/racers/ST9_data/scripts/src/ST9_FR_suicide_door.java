package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_FR_suicide_door extends FrontDoor
{
	public ST9_FR_suicide_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 suicide passenger's door";
		description = "Suicide type passenger's door for ST9 models.";

		value = tHUF2USD(119.302);
		brand_new_prestige_value = 62.27;
	}
}
