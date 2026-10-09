package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_R_headlights extends Headlights
{
	public Remo_R_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo stock right headlights";
		description = "Stock right headlights for Remo models.";

		value = tHUF2USD(101.491);
		brand_new_prestige_value = 41.47;
	}
}
