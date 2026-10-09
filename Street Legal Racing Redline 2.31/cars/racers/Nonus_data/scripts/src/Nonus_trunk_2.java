package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_trunk_2 extends Trunk
{
	public Nonus_trunk_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus DTM trunk";

		description = "A trunk for the Nonus DTM. Smoothed and lightened, it ensures optimal aerodynamics and high reliability.";

		brand_new_prestige_value = 33.23;

		value = tHUF2USD(1287.1);
	}
}
