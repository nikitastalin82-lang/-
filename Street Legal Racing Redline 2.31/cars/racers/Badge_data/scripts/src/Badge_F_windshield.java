package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_F_windshield extends Windshield
{
	public Badge_F_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge front windshield";
		description = "Stock front windshield for Badge models.";

		value = tHUF2USD(107.61);
		brand_new_prestige_value = 31.82;
	}
}
