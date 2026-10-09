package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_R_headlights_halo_purple extends Headlights
{
	public Ninja_R_headlights_halo_purple( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja halogen purple right headlights";
		description = "Halo purple right headlights for Ninja models.";

		value = tHUF2USD(97.31);
		brand_new_prestige_value = 55.93;
	}
}
