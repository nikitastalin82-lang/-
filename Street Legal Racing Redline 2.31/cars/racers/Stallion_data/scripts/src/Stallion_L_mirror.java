package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_L_mirror extends Mirror
{
	public Stallion_L_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion left mirror";
		description = "Stock left mirror for Stallion models.";

		value = tHUF2USD(57.814);
		brand_new_prestige_value = 31.82;
	}
}
