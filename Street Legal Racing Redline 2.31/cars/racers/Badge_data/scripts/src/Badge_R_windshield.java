package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_R_windshield extends Windshield
{
	public Badge_R_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge rear windshield";
		description = "Stock rear windshield for Badge models.";

		value = tHUF2USD(174.497);
		brand_new_prestige_value = 38.56;
	}
}
