package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_steering_wheel extends SteeringWheel
{
	public Coyot_steering_wheel( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Coyot steering wheel";
		description = "Stock 38.0 cm (15.0 inch) steering wheel for Coyot models.";

		diameter = 380.0;
		value = tHUF2USD(25.32);
		brand_new_prestige_value = 26.04;
	}
}
