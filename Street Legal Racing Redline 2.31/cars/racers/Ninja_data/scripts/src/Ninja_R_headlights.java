package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_R_headlights extends Headlights
{
	public Ninja_R_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja stock right headlights";
		description = "Stock right headlights for Ninja models.";

		value = tHUF2USD(48.53);
		brand_new_prestige_value = 41.47;
	}
}
