package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_F_bumper_3 extends Bumper
{
	public Axis_F_bumper_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis ZX360 front bumper";
		description = "Stylized front bumper for Axis ZX360 models.";

		value = tHUF2USD(262.273);
		brand_new_prestige_value = 50.26;
	}
}
