package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_R_windshield extends Windshield
{
	public Sunset_R_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset rear windshield";
		description = "Stock rear windshield for Sunset models.";

		value = tHUF2USD(174.919);
		brand_new_prestige_value = 26.04;
	}
}
