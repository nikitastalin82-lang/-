package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_F_bumper_2 extends Bumper
{
	public Codrac_F_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac custom front bumper";
		description = "Custom front bumper for Codrac models.";

		value = tHUF2USD(143.691);
		brand_new_prestige_value = 32.23;
	}
}
