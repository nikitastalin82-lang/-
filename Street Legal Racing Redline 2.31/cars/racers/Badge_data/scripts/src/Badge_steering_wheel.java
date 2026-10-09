package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_steering_wheel extends SteeringWheel
{
	public Badge_steering_wheel( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Badge steering wheel";
		description = "Stock 38.0 cm (15.0 inch) steering wheel for Badge models.";

		diameter = 380.0;
		value = tHUF2USD(38.402);
		brand_new_prestige_value = 31.82;
	}
}
