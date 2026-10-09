package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_hood_2 extends Hood
{
	public Stallion_hood_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion custom hood";
		description = "Custom hood for Stallion models.";

		value = tHUF2USD(239.485);
		brand_new_prestige_value = 44.31;
	}
}
