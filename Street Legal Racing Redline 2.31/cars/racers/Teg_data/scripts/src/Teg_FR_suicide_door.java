package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_FR_suicide_door extends FrontDoor
{
	public Teg_FR_suicide_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg suicide passenger's door";
		description = "Suicide type passenger's door for Teg models.";

		value = tHUF2USD(91.127);
		brand_new_prestige_value = 49.68;
	}
}
