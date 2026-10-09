package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_R_bumper extends Bumper
{
	public Axis_R_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis 200S rear bumper";
		description = "The stock rear bumper for Axis 200S models.";

		value = tHUF2USD(51.062);
		brand_new_prestige_value = 24.54;
	}
}
