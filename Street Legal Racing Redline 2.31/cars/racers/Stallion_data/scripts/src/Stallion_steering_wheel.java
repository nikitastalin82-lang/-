package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_steering_wheel extends SteeringWheel
{
	public Stallion_steering_wheel( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Stallion steering wheel";
		description = "Stock 38.0 cm (15.0 inch) steering wheel for Stallion models.";

		diameter = 380.0;
		value = tHUF2USD(49.796);
		brand_new_prestige_value = 31.92;
	}
}
