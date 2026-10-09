package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_L_headlights extends Headlights
{
	public Ninja_L_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja stock left headlights";
		description = "Stock left headlights for Ninja models.";

		value = tHUF2USD(48.53);
		brand_new_prestige_value = 41.47;
	}
}
