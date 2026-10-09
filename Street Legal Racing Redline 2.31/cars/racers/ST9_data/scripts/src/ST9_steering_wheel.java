package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_steering_wheel extends SteeringWheel
{
	public ST9_steering_wheel( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "ST9 steering wheel";
		description = "Stock 38.0 cm (15.0 inch) steering wheel for ST9 models.";

		diameter = 380.0;
		value = tHUF2USD(57.392);
		brand_new_prestige_value = 30.38;
	}
}
