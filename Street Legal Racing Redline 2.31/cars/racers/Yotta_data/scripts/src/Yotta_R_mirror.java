package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_R_mirror extends Mirror
{
	public Yotta_R_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta stock right mirror";
		description = "Stock right mirror for Yotta models.";

		value = tHUF2USD(43.044);
		brand_new_prestige_value = 31.82;
	}
}
