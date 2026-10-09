package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_L_headlights extends Headlights
{
	public Sunset_L_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset stock left headlights";
		description = "Stock left headlights for Sunset models.";

		value = tHUF2USD(47.053);
		brand_new_prestige_value = 41.47;
	}
}
