package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_L_headlights_halo_purple extends Headlights
{
	public Remo_L_headlights_halo_purple( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo halogen purple left headlights";
		description = "Halo purple left headlights for Remo models.";

		value = tHUF2USD(223.137);
		brand_new_prestige_value = 64.18;
	}
}
