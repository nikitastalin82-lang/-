package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_F_windshield extends Windshield
{
	public Remo_F_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo front windshield";
		description = "Stock front windshield for Remo models.";

		value = tHUF2USD(118.371);
		brand_new_prestige_value = 20.25;
	}
}
