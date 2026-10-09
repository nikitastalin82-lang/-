package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_R_bumper_2 extends Bumper
{
	public Codrac_R_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac custom rear bumper";
		description = "Custom rear bumper for Codrac models.";

		value = tHUF2USD(129.976);
		brand_new_prestige_value = 32.23;
	}
}
