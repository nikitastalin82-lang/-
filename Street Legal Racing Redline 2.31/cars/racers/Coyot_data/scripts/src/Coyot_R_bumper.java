package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_R_bumper extends Bumper
{
	public Coyot_R_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot stock rear bumper";
		description = "Stock rear bumper for Coyot models.";

		value = tHUF2USD(51.273);
		brand_new_prestige_value = 22.08;
	}
}
