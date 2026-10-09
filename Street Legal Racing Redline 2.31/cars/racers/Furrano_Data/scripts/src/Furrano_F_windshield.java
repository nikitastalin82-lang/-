package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_F_windshield extends Windshield
{
	public Furrano_F_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano front windshield";
		description = "Stock front windshield for Furrano models.";
		brand_new_prestige_value = 34.72;

		value = tHUF2USD(374.103);
	}
}