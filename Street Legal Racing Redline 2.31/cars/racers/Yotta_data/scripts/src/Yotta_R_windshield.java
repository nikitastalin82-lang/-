package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_R_windshield extends Windshield
{
	public Yotta_R_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta rear windshield";
		description = "Stock rear windshield for Yotta models.";

		value = tHUF2USD(130.398);
		brand_new_prestige_value = 31.82;
	}
}
