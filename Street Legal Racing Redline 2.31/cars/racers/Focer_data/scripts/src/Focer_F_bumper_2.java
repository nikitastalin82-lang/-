package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_F_bumper_2 extends Bumper
{
	public Focer_F_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;

		name = "Focer WRC front bumper";
		description = "The stock front bumper for the Focer WRC models.";

		value = tHUF2USD(149.81);
		brand_new_prestige_value = 33.86;
	}
}
