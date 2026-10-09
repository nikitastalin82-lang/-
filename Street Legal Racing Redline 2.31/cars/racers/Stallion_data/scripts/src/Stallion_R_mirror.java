package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_R_mirror extends Mirror
{
	public Stallion_R_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion right mirror";
		description = "Stock right mirror for Stallion models.";

		value = tHUF2USD(57.814);
		brand_new_prestige_value = 31.82;
	}
}
