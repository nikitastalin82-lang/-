package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_R_bumper_3 extends Bumper
{
	public Axis_R_bumper_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis ZX360 rear bumper";
		description = "Aerodynamic rear bumper for Axis ZX360 models.";

		value = tHUF2USD(257.631);
		brand_new_prestige_value = 50.26;

	}
}
