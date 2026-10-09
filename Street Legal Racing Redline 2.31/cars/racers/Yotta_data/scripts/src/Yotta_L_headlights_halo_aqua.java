package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_L_headlights_halo_aqua extends Headlights
{
	public Yotta_L_headlights_halo_aqua( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta halogen aqua left headlights";
		description = "Halo aqua left headlights for Yotta models.";

		value = tHUF2USD(202.937);
		brand_new_prestige_value = 61.20;
	}
}
