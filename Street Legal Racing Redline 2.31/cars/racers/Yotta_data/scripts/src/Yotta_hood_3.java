package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_hood_3 extends Hood
{
	public Yotta_hood_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta tuner hood";
		description = "Aero hood for Yotta models.";

		value = tHUF2USD(273.821);
		brand_new_prestige_value = 55.29;
	}
}
