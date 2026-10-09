package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_hood_2 extends Hood
{
	public Kurumma_hood_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma Z35C hood";
		description = "Stock hood for the Kurumma Z35C.";

		value = tHUF2USD(302.785);
		brand_new_prestige_value = 44.31;
	}
}
