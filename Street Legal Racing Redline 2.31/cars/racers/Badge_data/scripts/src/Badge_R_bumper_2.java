package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_R_bumper_2 extends Bumper
{
	public Badge_R_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge GTO bumper";
		description = "Stock rear bumper for the Badge GTO.";

		value = tHUF2USD(230.098);
		brand_new_prestige_value = 44.31;
	}
}
