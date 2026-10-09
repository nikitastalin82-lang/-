package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_hood_2 extends Hood
{
	public Sunset_hood_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset E98T hood";
		description = "Stock hood for the Sunset E98T.";

		value = tHUF2USD(153.819);
		brand_new_prestige_value = 36.26;
	}
}
