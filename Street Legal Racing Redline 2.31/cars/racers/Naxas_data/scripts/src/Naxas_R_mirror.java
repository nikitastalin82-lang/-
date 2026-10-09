package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_R_mirror extends Mirror
{
	public Naxas_R_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas Tornado right mirror";
		description = "Stock right mirror for the Naxas Tornado.";

		value = tHUF2USD(179.983);
		brand_new_prestige_value = 37.61;
	}
}
