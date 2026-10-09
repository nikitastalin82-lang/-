package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_hood_3 extends Hood
{
	public Naxas_hood_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas Extreme Edition hood";
		description = "Stock hood for the Naxas Extreme Edition.";

		value = tHUF2USD(614.221);
		brand_new_prestige_value = 65.34;
	}
}
