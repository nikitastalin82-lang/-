package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_hood extends Hood
{
	public Remo_hood( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo stock hood";
		description = "Stock hood for Remo models.";

		value = tHUF2USD(160.782);
		brand_new_prestige_value = 17.17;
	}
}
