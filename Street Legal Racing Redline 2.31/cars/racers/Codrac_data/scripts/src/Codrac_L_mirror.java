package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_L_mirror extends Mirror
{
	public Codrac_L_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac stock left mirror";
		description = "Stock left mirror for Codrac models.";

		value = tHUF2USD(39.457);
		brand_new_prestige_value = 23.14;
	}
}
