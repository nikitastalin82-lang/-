package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_FR_blinker_halo_purple extends Taillights
{
	public Naxas_FR_blinker_halo_purple( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas halogen purple right blinker";
		description = "Halo purple headlights components for Naxas models.";

		value = tHUF2USD(261.121);
		brand_new_prestige_value = 50.11;
	}
}
