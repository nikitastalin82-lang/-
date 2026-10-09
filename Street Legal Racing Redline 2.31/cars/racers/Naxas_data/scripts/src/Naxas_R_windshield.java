package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_R_windshield extends Windshield
{
	public Naxas_R_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas rear windshield";
		description = "Stock rear windshield for Naxas models.";

		value = tHUF2USD(371.149);
		brand_new_prestige_value = 37.61;
	}
}
