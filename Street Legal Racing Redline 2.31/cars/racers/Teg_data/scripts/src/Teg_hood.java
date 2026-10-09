package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_hood extends Hood
{
	public Teg_hood( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg stock hood";
		description = "Stock hood for Teg models.";

		value = tHUF2USD(98.537);
		brand_new_prestige_value = 20.85;
	}
}
