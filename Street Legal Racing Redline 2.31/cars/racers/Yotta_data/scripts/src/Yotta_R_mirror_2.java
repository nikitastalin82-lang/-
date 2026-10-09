package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_R_mirror_2 extends Mirror
{
	public Yotta_R_mirror_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta custom right mirror";
		description = "Custom right mirror for Yotta models.";

		value = tHUF2USD(71.74);
		brand_new_prestige_value = 38.98;
	}
}
