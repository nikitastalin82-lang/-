package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_L_mirror extends Mirror
{
	public Naxas_L_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas Tornado left mirror";
		description = "Stock left mirror for the Naxas Tornado.";

		value = tHUF2USD(179.983);
		brand_new_prestige_value = 37.61;
	}
}
