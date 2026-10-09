package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_R_bumper_2 extends Bumper
{
	public Remo_R_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo custom bumper";
		description = "Custom rear bumper for Remo models.";

		value = tHUF2USD(151.92);
		brand_new_prestige_value = 28.20;
	}
}
