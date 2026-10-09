package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_F_bumper_3 extends Bumper
{
	public Codrac_F_bumper_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac tuner front bumper";
		description = "Stylized front bumper for Codrac models.";

		value = tHUF2USD(125.175);
		brand_new_prestige_value = 40.21;
	}
}
