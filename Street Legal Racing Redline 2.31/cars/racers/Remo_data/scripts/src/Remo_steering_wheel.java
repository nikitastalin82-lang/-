package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_steering_wheel extends SteeringWheel
{
	public Remo_steering_wheel( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Remo steering wheel";
		description = "Stock 38.0 cm (15.0 inch) steering wheel for Remo models.";

		diameter = 380.0;
		value = tHUF2USD(44.521);
		brand_new_prestige_value = 20.25;
	}
}
