package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_R_mirror extends Mirror
{
	public Remo_R_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo right mirror";
		description = "Stock right mirror for Remo models.";

		value = tHUF2USD(43.677);
		brand_new_prestige_value = 20.25;
	}
}
