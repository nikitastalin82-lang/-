package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_R_mirror_2 extends Mirror
{
	public Ninja_R_mirror_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja PowerLine right mirror";
		description = "Stock right mirror for Ninja PowerLine models.";

		value = tHUF2USD(67.52);
		brand_new_prestige_value = 26.58;
	}
}
