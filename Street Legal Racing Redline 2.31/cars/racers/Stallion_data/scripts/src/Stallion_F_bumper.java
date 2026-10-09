package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_F_bumper extends Bumper
{
	public Stallion_F_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion stock front bumper";
		description = "Stock front bumper for Stallion models.";

		value = tHUF2USD(107.821);
		brand_new_prestige_value = 26.99;
	}
}
