package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_hood_3 extends Hood
{
	public Sunset_hood_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset E001SL hood";
		description = "Stock hood for the Sunset E001SL.";

		value = tHUF2USD(270.713);
		brand_new_prestige_value = 45.23;
	}
}
