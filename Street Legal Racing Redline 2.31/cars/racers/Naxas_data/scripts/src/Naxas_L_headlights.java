package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_L_headlights extends Headlights
{
	public Naxas_L_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas stock left headlights";
		description = "Stock left headlights for Naxas models.";

		value = tHUF2USD(206.991);
		brand_new_prestige_value = 41.47;
	}
}
