package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_L_mirror_2 extends Mirror
{
	public Yotta_L_mirror_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta custom left mirror";
		description = "Custom left mirror for Yotta models.";

		value = tHUF2USD(71.74);
		brand_new_prestige_value = 38.98;
	}
}
