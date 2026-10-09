package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_FR_blinker extends Taillights
{
	public Naxas_FR_blinker( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas front right blinker";
		description = "Stock headlights components for Naxas models.";

		value = tHUF2USD(107.821);
		brand_new_prestige_value = 37.61;
	}
}
