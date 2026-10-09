package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_R_bumper extends Bumper
{
	public Codrac_R_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac stock rear bumper";
		description = "Stock rear bumper for Codrac models.";

		value = tHUF2USD(60.768);
		brand_new_prestige_value = 19.63;
	}
}
