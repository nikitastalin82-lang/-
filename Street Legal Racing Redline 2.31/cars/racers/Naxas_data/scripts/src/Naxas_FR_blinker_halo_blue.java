package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_FR_blinker_halo_blue extends Taillights
{
	public Naxas_FR_blinker_halo_blue( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas halogen blue right blinker";
		description = "Halo blue headlights components for Naxas models.";

		value = tHUF2USD(261.121);
		brand_new_prestige_value = 50.11;
	}
}
