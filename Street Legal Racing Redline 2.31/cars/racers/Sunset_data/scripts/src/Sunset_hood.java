package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_hood extends Hood
{
	public Sunset_hood( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset E96S hood";
		description = "Stock hood for the Sunset E96S.";

		value = tHUF2USD(112.041);
		brand_new_prestige_value = 22.08;
	}
}
