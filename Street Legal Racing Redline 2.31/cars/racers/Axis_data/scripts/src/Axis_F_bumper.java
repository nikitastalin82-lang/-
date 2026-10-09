package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_F_bumper extends Bumper
{
	public Axis_F_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis 200S front bumper";
		description = "The stock front bumper for Axis 200S models.";

		value = tHUF2USD(58.236);
		brand_new_prestige_value = 24.54;
	}
}
