package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_hood_2 extends Hood
{
	public Teg_hood_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg custom hood";
		description = "Custom hood for Teg models.";

		value = tHUF2USD(139.893);
		brand_new_prestige_value = 34.24;
	}
}
