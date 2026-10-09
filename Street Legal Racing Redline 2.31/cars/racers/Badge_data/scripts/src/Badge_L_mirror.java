package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_L_mirror extends Mirror
{
	public Badge_L_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge '67 left mirror";
		description = "Stock left mirror for the Badge '67.";

		value = tHUF2USD(73.217);
		brand_new_prestige_value = 31.82;
	}
}
