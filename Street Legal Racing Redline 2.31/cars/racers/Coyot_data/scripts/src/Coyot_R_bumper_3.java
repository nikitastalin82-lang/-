package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_R_bumper_3 extends Bumper
{
	public Coyot_R_bumper_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot tuner rear bumper";
		description = "Stylized rear bumper for Coyot models.";

		value = tHUF2USD(151.726);
		brand_new_prestige_value = 45.23;

	}
}
