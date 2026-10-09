package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_R_mirror_2 extends Mirror
{
	public Codrac_R_mirror_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac custom right mirror";
		description = "Custom right mirror for Codrac models.";

		value = tHUF2USD(45.787);
		brand_new_prestige_value = 28.35;
	}
}
