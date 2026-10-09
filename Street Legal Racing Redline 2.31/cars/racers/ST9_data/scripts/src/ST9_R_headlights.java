package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_R_headlights extends Headlights
{
	public ST9_R_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 stock right headlights";
		description = "Stock right headlights for ST9 models.";

		value = tHUF2USD(63.511);
		brand_new_prestige_value = 41.47;
	}
}
