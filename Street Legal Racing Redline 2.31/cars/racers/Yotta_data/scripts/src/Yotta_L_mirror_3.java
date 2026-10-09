package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_L_mirror_3 extends Mirror
{
	public Yotta_L_mirror_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta tuner left mirror";
		description = "Stylized left mirror for Yotta models.";

		value = tHUF2USD(107.821);
		brand_new_prestige_value = 43.31;
	}
}
