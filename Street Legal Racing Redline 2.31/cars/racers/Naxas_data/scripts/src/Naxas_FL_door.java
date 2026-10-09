package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_FL_door extends FrontDoor
{
	public Naxas_FL_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas stock driver's door";
		description = "Stock driver's door for Naxas models.";

		value = tHUF2USD(327.05);
		brand_new_prestige_value = 37.61;
	}
}
