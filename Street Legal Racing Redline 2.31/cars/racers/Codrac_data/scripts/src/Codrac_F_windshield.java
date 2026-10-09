package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_F_windshield extends Windshield
{
	public Codrac_F_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac front windshield";
		description = "Stock front windshield for Codrac models.";

		value = tHUF2USD(179.772);
		brand_new_prestige_value = 23.14;
	}
}
