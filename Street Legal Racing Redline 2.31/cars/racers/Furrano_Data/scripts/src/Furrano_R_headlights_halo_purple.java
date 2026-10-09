package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_R_headlights_halo_purple extends Headlights
{
	public Furrano_R_headlights_halo_purple( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano halogen purple right headlights";
		description = "Halogen lights for Furrano models.";
		brand_new_prestige_value = 53.89;

		value = tHUF2USD(215.143);
	}
}