package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_F_windshield extends Windshield
{
	public Sunset_F_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset front windshield";
		description = "Stock front windshield for Sunset models.";

		value = tHUF2USD(164.158);
		brand_new_prestige_value = 26.04;
	}
}
