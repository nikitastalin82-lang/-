package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_F_bumper_3 extends Bumper
{
	public Yotta_F_bumper_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta tuner front bumper";
		description = "Stylized front bumper for Yotta models.";

		value = tHUF2USD(236.32);
		brand_new_prestige_value = 55.29;
	}
}
