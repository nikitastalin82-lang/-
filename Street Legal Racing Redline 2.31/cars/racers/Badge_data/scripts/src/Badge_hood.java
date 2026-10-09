package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_hood extends Hood
{
	public Badge_hood( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge '67 hood";
		description = "Stock hood for Badge '67 models.";

		value = tHUF2USD(165.213);
		brand_new_prestige_value = 26.99;
	}
}
