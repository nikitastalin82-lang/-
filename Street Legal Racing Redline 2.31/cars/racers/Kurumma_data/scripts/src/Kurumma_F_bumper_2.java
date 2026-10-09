package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_F_bumper_2 extends Bumper
{
	public Kurumma_F_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma Z35C front bumper";
		description = "Stock front bumper for the Kurumma Z35C.";

		value = tHUF2USD(238.43);
		brand_new_prestige_value = 44.31;
	}
}
