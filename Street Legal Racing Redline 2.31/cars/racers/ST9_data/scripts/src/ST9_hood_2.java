package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_hood_2 extends Hood
{
	public ST9_hood_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 custom hood";
		description = "Custom hood for ST9 models.";

		value = tHUF2USD(303.629);
		brand_new_prestige_value = 42.30;
	}
}
