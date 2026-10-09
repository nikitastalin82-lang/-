package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_R_bumper_2 extends Bumper
{
	public Axis_R_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis 200XT rear bumper";
		description = "Stylized rear bumper for Axis 200XT models.";

		value = tHUF2USD(183.992);
		brand_new_prestige_value = 40.29;
	}
}
