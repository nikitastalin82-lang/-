package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_steering_wheel extends SteeringWheel
{
	public Codrac_steering_wheel( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Codrac steering wheel";
		description = "Stock 38.0 cm (15.0 inch) steering wheel for Codrac models.";

		diameter = 380.0;
		value = tHUF2USD(25.32);
		brand_new_prestige_value = 23.14;
	}
}
