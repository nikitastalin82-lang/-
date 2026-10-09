package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_R_bumper_3 extends Bumper
{
	public Codrac_R_bumper_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac tuner rear bumper";
		description = "Stylized rear bumper for Codrac models";

		value = tHUF2USD(183.992);
		brand_new_prestige_value = 40.21;

	}
}
