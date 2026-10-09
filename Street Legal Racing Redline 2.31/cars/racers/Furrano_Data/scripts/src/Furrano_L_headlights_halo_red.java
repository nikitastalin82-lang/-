package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_L_headlights_halo_red extends Headlights
{
	public Furrano_L_headlights_halo_red( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano halogen red left headlights";
		description = "Halogen lights for Furrano models.";
		brand_new_prestige_value = 53.89;

		value = tHUF2USD(215.143);
	}
}