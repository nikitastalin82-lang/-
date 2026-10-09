package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_F_bumper_2 extends Bumper
{
	public Axis_F_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis 200XT front bumper";
		description = "Light alloy front bumper for Axis 200XT models.";

		value = tHUF2USD(174.075);
		brand_new_prestige_value = 40.29;
	}
}
