package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_hood_2 extends Hood
{
	public Yotta_hood_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta custom hood";
		description = "Custom hood for Yotta models.";

		value = tHUF2USD(192.01);
		brand_new_prestige_value = 44.31;
	}
}
