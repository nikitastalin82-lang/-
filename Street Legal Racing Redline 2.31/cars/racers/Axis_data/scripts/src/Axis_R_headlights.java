package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_R_headlights extends Headlights
{
	public Axis_R_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis stock right headlights";
		description = "Stock right headlights for Axis models.";

		value = tHUF2USD(69.63);
		brand_new_prestige_value = 41.47;
	}
}
