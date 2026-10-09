package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_R_bumper_2 extends Bumper
{
	public Yotta_R_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta custom bumper";
		description = "Custom rear bumper for Yotta models.";

		value = tHUF2USD(129.765);
		brand_new_prestige_value = 44.31;
	}
}
