package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_R_mirror_3 extends Mirror
{
	public Yotta_R_mirror_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta tuner right mirror";
		description = "Stylized right mirror for Yotta models.";

		value = tHUF2USD(107.821);
		brand_new_prestige_value = 43.31;
	}
}
