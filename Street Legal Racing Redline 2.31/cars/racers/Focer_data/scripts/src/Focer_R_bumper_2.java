package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_R_bumper_2 extends Bumper
{
	public Focer_R_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Focer WRC rear bumper";
		description = "Stock rear bumper for the Focer WRC";
		brand_new_prestige_value = 31.10;

 		value = tHUF2USD(158.672);
	}
}
