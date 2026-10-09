package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_F_bumper_3 extends Bumper
{
	public Coyot_F_bumper_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot tuner front bumper";
		description = "Stylized front bumper for Coyot models.";

		value = tHUF2USD(182.726);
		brand_new_prestige_value = 45.23;
	}
}
