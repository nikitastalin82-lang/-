package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_L_mirror extends Mirror
{
	public Coyot_L_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot stock left mirror";
		description = "Stock left mirror for Coyot models.";

		value = tHUF2USD(23.21);
		brand_new_prestige_value = 26.04;
	}
}
