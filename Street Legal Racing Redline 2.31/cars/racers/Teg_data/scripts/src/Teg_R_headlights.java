package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_R_headlights extends Headlights
{
	public Teg_R_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg stock right headlights";
		description = "Stock right headlights for Teg models.";

		value = tHUF2USD(46.631);
		brand_new_prestige_value = 41.47;
	}
}
