package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_hood_2 extends Hood
{
	public Badge_hood_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge GTO hood";
		description = "Stock hood for Badge GTO models.";

		value = tHUF2USD(312.491);
		brand_new_prestige_value = 44.31;
	}
}
