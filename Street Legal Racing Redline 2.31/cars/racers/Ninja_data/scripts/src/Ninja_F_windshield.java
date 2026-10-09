package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_F_windshield extends Windshield
{
	public Ninja_F_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja front windshield";
		description = "Stock front windshield for Ninja models.";

		value = tHUF2USD(61.19);
		brand_new_prestige_value = 21.70;
	}
}
