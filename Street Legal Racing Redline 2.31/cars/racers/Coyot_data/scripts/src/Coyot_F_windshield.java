package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_F_windshield extends Windshield
{
	public Coyot_F_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot front windshield";
		description = "Stock front windshield for Coyot models.";

		value = tHUF2USD(179.772);
		brand_new_prestige_value = 26.04;
	}
}
