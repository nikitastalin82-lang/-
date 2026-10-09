package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_steering_wheel extends SteeringWheel
{
	public Axis_steering_wheel( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Axis steering wheel";
		description = "Stock 38.0 cm (15.0 inch) steering wheel for Axis models.";

		diameter = 380.0;
		value = tHUF2USD(30.173);
		brand_new_prestige_value = 28.93;
	}
}
