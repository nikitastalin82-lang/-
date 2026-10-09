package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_RR_blinker extends Taillights
{
	public Naxas_RR_blinker( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas rear right blinker";
		description = "Stock taillights components for Naxas models.";

		value = tHUF2USD(103.39);
		brand_new_prestige_value = 37.61;
	}
}
