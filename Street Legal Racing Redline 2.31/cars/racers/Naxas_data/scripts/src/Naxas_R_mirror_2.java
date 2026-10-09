package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_R_mirror_2 extends Mirror
{
	public Naxas_R_mirror_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas Lux4000 right mirror";
		description = "Stock right mirror for the Naxas Lux4000.";

		value = tHUF2USD(305.95);
		brand_new_prestige_value = 46.06;
	}
}
