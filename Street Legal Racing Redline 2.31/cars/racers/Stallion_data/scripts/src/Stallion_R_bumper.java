package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_R_bumper extends Bumper
{
	public Stallion_R_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion rear bumper";
		description = "Stock rear bumper for Stallion.";

		value = tHUF2USD(99.381);
		brand_new_prestige_value = 26.99;
	}
}
