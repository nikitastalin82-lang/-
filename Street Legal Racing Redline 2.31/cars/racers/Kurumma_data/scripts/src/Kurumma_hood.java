package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_hood extends Hood
{
	public Kurumma_hood( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma Z3 hood";
		description = "Stock hood for the Kurumma Z3.";

		value = tHUF2USD(247.292);
		brand_new_prestige_value = 26.99;
	}
}
