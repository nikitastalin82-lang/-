package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_hood extends Hood
{
	public Coyot_hood( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot stock hood";
		description = "Stock hood for Coyot models.";

		value = tHUF2USD(116.05);
		brand_new_prestige_value = 22.08;
	}
}
