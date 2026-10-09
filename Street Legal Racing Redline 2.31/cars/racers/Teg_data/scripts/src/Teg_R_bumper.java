package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_R_bumper extends Bumper
{
	public Teg_R_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg stock rear bumper";
		description = "Stock rear bumper for Teg models.";

		value = tHUF2USD(62.034);
		brand_new_prestige_value = 20.85;
	}
}
