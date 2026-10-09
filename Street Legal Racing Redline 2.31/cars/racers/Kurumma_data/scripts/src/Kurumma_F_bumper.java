package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_F_bumper extends Bumper
{
	public Kurumma_F_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma Z3 front bumper";
		description = "Stock front bumper for the Kurumma Z3.";

		value = tHUF2USD(173.653);
		brand_new_prestige_value = 26.99;
	}
}
