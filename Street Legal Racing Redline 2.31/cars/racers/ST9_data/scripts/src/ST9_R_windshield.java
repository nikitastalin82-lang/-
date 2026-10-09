package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_R_windshield extends Windshield
{
	public ST9_R_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 rear windshield";
		description = "Stock rear windshield for ST9 models.";

		value = tHUF2USD(151.92);
		brand_new_prestige_value = 30.38;
	}
}
