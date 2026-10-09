package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_F_windshield extends Windshield
{
	public Yotta_F_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta front windshield";
		description = "Stock front windshield for Yotta models.";

		value = tHUF2USD(109.72);
		brand_new_prestige_value = 31.82;
	}
}
