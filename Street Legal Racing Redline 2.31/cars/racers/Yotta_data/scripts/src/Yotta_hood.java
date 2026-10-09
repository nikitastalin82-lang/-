package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_hood extends Hood
{
	public Yotta_hood( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta stock hood";
		description = "Stock hood for Yotta models.";

		value = tHUF2USD(164.369);
		brand_new_prestige_value = 26.99;
	}
}
