package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_R_headlights_halo_pink extends Headlights
{
	public Furrano_R_headlights_halo_pink( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano halogen pink right headlights";
		description = "Halogen lights for Furrano models.";
		brand_new_prestige_value = 53.89;

		value = tHUF2USD(215.143);
	}
}