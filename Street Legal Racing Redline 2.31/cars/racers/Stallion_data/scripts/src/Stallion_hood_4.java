package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_hood_4 extends Hood
{
	public Stallion_hood_4( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion replacement hood 2";
		description = "Stylish aerodynamic hood for Stallion models.";

		value = tHUF2USD(298.119);
		brand_new_prestige_value = 69.80;
	}
}
