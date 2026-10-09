package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_FR_blinker_halo_pink extends Taillights
{
	public Naxas_FR_blinker_halo_pink( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas halogen pink right blinker";
		description = "Halo pink headlights components for Naxas models.";

		value = tHUF2USD(261.121);
		brand_new_prestige_value = 50.11;
	}
}
