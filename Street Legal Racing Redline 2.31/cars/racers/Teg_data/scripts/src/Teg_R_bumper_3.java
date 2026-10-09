package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_R_bumper_3 extends Bumper
{
	public Teg_R_bumper_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg tuner rear bumper";
		description = "Stylized rear bumper for Teg models.";

		value = tHUF2USD(151.076);
		brand_new_prestige_value = 42.72;

	}
}
