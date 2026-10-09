package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_steering_wheel extends SteeringWheel
{
	public Furrano_steering_wheel( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Furrano steering wheel";
		description = "Stock steering wheel for Furrano models.";
		brand_new_prestige_value = 34.72;

		diameter = 380.0;
		value = tHUF2USD(71.74);
	}
}