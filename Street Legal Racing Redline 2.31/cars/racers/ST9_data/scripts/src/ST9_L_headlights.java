package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_L_headlights extends Headlights
{
	public ST9_L_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 stock left headlights";
		description = "Stock left headlights for ST9 models.";

		value = tHUF2USD(63.511);
		brand_new_prestige_value = 41.47;
	}
}
