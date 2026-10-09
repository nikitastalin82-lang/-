package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_hood_3 extends Hood
{
	public Badge_hood_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge custom hood";
		description = "Custom hood for Badge models.";

		value = tHUF2USD(408.707);
		brand_new_prestige_value = 55.29;
	}
}
