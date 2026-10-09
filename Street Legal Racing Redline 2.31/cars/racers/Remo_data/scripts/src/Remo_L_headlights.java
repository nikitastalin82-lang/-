package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_L_headlights extends Headlights
{
	public Remo_L_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo stock left headlights";
		description = "Stock left headlights for Remo models.";

		value = tHUF2USD(101.491);
		brand_new_prestige_value = 41.47;
	}
}
