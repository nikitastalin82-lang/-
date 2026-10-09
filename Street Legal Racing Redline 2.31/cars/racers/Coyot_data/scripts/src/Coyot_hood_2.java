package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_hood_2 extends Hood
{
	public Coyot_hood_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot custom hood";
		description = "Custom hood for Coyot models.";

		value = tHUF2USD(181.671);
		brand_new_prestige_value = 36.26;
	}
}
