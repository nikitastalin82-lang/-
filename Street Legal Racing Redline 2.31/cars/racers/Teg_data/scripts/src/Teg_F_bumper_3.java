package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_F_bumper_3 extends Bumper
{
	public Teg_F_bumper_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg tuner front bumper";
		description = "Stylized front bumper for Teg models.";

		value = tHUF2USD(173.02);
		brand_new_prestige_value = 42.72;
	}
}
