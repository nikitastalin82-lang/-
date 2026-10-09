package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_hood_4 extends Hood
{
	public Einvagen_hood_4( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen 140 DTM hood";
		description = "A hood for Einvagen 140 DTM. Its shapes are similiar to shapes of hood from 140 GTA model, but Einvagen engineers have improved it for racing in DTM, making it lighter and giving it additional aerodynamics for better efficiency.";

		value = tHUF2USD(4156.7);
		brand_new_prestige_value = 90.00;
	}
}
