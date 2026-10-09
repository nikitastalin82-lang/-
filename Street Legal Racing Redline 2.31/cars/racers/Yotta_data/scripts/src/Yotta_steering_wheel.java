package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_steering_wheel extends SteeringWheel
{
	public Yotta_steering_wheel( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Yotta steering wheel";
		description = "Stock 38.0 cm (15.0 inch) steering wheel for Yotta models.";

		diameter = 380.0;
		value = tHUF2USD(46.631);
		brand_new_prestige_value = 31.82;
	}
}
