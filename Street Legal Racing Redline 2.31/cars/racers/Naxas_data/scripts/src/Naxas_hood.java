package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_hood extends Hood
{
	public Naxas_hood( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas stock hood";
		description = "Stock hood for Naxas models.";

		value = tHUF2USD(370.938);
		brand_new_prestige_value = 31.90;
	}
}
