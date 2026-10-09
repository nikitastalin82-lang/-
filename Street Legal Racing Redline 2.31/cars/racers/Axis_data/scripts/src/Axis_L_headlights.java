package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_L_headlights extends Headlights
{
	public Axis_L_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis stock left headlights";
		description = "Stock left headlights for the Axis models.";

		value = tHUF2USD(69.63);
		brand_new_prestige_value = 41.47;
	}
}
