package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_R_bumper extends Bumper
{
	public Naxas_R_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas Tornado rear bumper";
		description = "Stock rear bumper for the Naxas Tornado.";

		value = tHUF2USD(344.352);
		brand_new_prestige_value = 31.90;
	}
}
