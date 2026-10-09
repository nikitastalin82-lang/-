package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_L_mirror_2 extends Mirror
{
	public Codrac_L_mirror_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac custom left mirror";
		description = "Custom left mirror for Codrac models.";

		value = tHUF2USD(45.787);
		brand_new_prestige_value = 28.35;
	}
}
