package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_hood_3 extends Hood
{
	public Axis_hood_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis ZX360 hood";
		description = "Aerodynamic hood for Axis ZX360 models.";

		value = tHUF2USD(543.114);
		brand_new_prestige_value = 50.26;
	}
}
