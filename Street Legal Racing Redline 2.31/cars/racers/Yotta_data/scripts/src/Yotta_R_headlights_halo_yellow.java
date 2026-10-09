package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_R_headlights_halo_yellow extends Headlights
{
	public Yotta_R_headlights_halo_yellow( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta halogen yellow right headlights";
		description = "Halo yellow right headlights for Yotta models.";

		value = tHUF2USD(202.937);
		brand_new_prestige_value = 61.20;
	}
}
