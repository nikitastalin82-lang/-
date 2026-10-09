package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_R_headlights_3 extends Headlights
{
	public Focer_R_headlights_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Focer WRC right headlights";

		description = "Stock headlights for the Focer WRC";

		value = tHUF2USD(77.015);
		brand_new_prestige_value = 72.11;
	}
}
