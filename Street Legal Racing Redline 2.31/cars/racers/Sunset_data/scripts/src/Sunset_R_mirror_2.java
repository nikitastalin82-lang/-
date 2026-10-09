package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_R_mirror_2 extends Mirror
{
	public Sunset_R_mirror_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset E98T right mirror";
		description = "Stock right mirror for the Sunset E98T.";

		value = tHUF2USD(55.915);
		brand_new_prestige_value = 31.89;
	}
}
