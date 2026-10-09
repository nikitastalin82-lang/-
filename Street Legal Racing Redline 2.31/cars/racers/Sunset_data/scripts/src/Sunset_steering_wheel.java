package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_steering_wheel extends SteeringWheel
{
	public Sunset_steering_wheel( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Sunset steering wheel";
		description = "Stock 39.0 cm (15.4 inch) steering wheel for Sunset models.";

		diameter = 390.0;
		value = tHUF2USD(24.476);
		brand_new_prestige_value = 26.04;
	}
}
