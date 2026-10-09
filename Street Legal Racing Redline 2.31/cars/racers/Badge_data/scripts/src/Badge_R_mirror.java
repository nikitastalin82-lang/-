package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_R_mirror extends Mirror
{
	public Badge_R_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge '67 right mirror";
		description = "Stock right mirror for Badge '67 models.";

		value = tHUF2USD(73.217);
		brand_new_prestige_value = 31.82;
	}
}
