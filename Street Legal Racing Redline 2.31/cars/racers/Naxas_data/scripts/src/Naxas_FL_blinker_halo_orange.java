package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_FL_blinker_halo_orange extends Taillights
{
	public Naxas_FL_blinker_halo_orange( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas halogen orange front left blinker";
		description = "Halo orange headlights components for Naxas models.";

		value = tHUF2USD(261.121);
		brand_new_prestige_value = 50.11;
	}
}
