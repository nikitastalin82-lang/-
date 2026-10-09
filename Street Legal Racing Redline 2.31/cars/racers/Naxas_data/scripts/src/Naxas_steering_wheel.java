package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_steering_wheel extends SteeringWheel
{
	public Naxas_steering_wheel( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Naxas steering wheel";
		description = "Stock 48.0 cm (18.9 inch) steering wheel for Naxas models.";

		diameter = 480.0;
		value = tHUF2USD(92.207);
		brand_new_prestige_value = 37.61;
	}
}
