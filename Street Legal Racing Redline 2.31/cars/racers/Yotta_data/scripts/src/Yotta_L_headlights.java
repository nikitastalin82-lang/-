package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_L_headlights extends Headlights
{
	public Yotta_L_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta stock left headlights";
		description = "Stock left headlights for Yotta models.";

		value = tHUF2USD(73.006);
		brand_new_prestige_value = 41.47;
	}
}
