package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_F_bumper_2 extends Bumper
{
	public Yotta_F_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta custom front bumper";
		description = "Custom front bumper for Yotta models.";

		value = tHUF2USD(185.68);
		brand_new_prestige_value = 44.31;
	}
}
