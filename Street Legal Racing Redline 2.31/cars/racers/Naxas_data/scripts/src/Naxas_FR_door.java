package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_FR_door extends FrontDoor
{
	public Naxas_FR_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas stock passenger's door";
		description = "Stock passenger's door for Naxas models.";

		value = tHUF2USD(327.05);
		brand_new_prestige_value = 37.61;
	}
}
