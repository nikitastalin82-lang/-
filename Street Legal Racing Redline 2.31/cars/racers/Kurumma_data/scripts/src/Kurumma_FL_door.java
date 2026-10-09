package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_FL_door extends FrontDoor
{
	public Kurumma_FL_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma stock driver's door";
		description = "Stock driver's door for Kurumma models.";

		value = tHUF2USD(92.84);
		brand_new_prestige_value = 31.82;
	}
}
