package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_hood_2 extends Hood
{
	public Naxas_hood_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas Lux4000 hood";
		description = "Stock hood for the Naxas Lux4000.";

		value = tHUF2USD(499.226);
		brand_new_prestige_value = 52.37;
	}
}
