package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_R_mirror extends Mirror
{
	public Codrac_R_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac stock right mirror";
		description = "Stock right mirror for Codrac models.";

		value = tHUF2USD(39.457);
		brand_new_prestige_value = 23.14;
	}
}
