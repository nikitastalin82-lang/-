package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_R_bumper_2 extends Bumper
{
	public Teg_R_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg custom bumper";
		description = "Custom rear bumper for Teg models.";

		value = tHUF2USD(129.343);
		brand_new_prestige_value = 34.24;
	}
}
