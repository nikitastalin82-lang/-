package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_R_headlights_halo_yellow extends Headlights
{
	public Remo_R_headlights_halo_yellow( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo halogen yellow right headlights";
		description = "Halo yellow right headlights for Remo models.";

		value = tHUF2USD(223.137);
		brand_new_prestige_value = 64.18;
	}
}
