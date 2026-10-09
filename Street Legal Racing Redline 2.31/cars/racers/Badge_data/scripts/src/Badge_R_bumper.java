package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_R_bumper extends Bumper
{
	public Badge_R_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge '67 rear bumper";
		description = "Stock rear bumper for the Badge '67.";

		value = tHUF2USD(90.163);
		brand_new_prestige_value = 26.99;
	}
}
