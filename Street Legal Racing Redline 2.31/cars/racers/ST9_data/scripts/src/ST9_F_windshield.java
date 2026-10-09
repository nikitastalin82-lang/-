package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_F_windshield extends Windshield
{
	public ST9_F_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 front windshield";
		description = "Stock front windshield for ST9 models.";

		value = tHUF2USD(139.471);
		brand_new_prestige_value = 30.38;
	}
}
