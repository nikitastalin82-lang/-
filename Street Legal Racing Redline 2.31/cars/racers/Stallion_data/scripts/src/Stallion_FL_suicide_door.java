package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_FL_suicide_door extends FrontDoor
{
	public Stallion_FL_suicide_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion suicide driver's door";
		description = "Suicide type driver's door for Stallion models.";

		value = tHUF2USD(127.273);
		brand_new_prestige_value = 49.31;
	}
}
