package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_R_windshield extends Windshield
{
	public Coyot_R_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot rear windshield";
		description = "Stock rear windshield for Coyot models.";

		value = tHUF2USD(194.753);
		brand_new_prestige_value = 26.04;
	}
}
