package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_RR_blinker_dark extends Taillights
{
	public Naxas_RR_blinker_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas dark rear right blinker";
		description = "Dark taillights components for Naxas models.";

		value = tHUF2USD(105.39);
		brand_new_prestige_value = 40.61;
	}
}
