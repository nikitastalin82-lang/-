package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_L_mirror extends Mirror
{
	public Remo_L_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo left mirror";
		description = "Stock left mirror for Remo models.";

		value = tHUF2USD(43.677);
		brand_new_prestige_value = 20.25;
	}
}
