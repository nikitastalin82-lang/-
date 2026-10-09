package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_R_bumper_2 extends Bumper
{
	public Coyot_R_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot custom bumper";
		description = "Custom rear bumper for Coyot models.";

		value = tHUF2USD(110.353);
		brand_new_prestige_value = 36.26;
	}
}
