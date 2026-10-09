package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_hood_3 extends Hood
{
	public Stallion_hood_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion tuner hood";
		description = "Aero hood for Stallion models.";

		value = tHUF2USD(329.793);
		brand_new_prestige_value = 55.29;
	}
}
