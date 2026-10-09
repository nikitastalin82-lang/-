package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_steering_wheel extends SteeringWheel
{
	public Ninja_steering_wheel( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Ninja steering wheel";
		description = "Stock 38.0 cm (15.0 inch) steering wheel for Ninja models.";

		diameter = 380.0;
		value = tHUF2USD(34.604);
		brand_new_prestige_value = 21.70;
	}
}
