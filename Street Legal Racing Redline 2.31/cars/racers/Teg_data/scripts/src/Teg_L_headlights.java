package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_L_headlights extends Headlights
{
	public Teg_L_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg stock left headlights";
		description = "Stock left headlights for Teg models.";

		value = tHUF2USD(46.631);
		brand_new_prestige_value = 41.47;
	}
}
