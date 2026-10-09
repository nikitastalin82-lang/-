package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_R_headlights extends Headlights
{
	public Sunset_R_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset stock right headlights";
		description = "Stock right headlights for Sunset models.";

		value = tHUF2USD(47.053);
		brand_new_prestige_value = 41.47;
	}
}
