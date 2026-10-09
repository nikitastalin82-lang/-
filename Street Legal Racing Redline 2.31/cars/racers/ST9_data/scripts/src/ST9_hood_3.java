package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_hood_3 extends Hood
{
	public ST9_hood_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 tuner hood";
		description = "Aero hood for ST9 models.";

		value = tHUF2USD(414.193);
		brand_new_prestige_value = 52.77;
	}
}
