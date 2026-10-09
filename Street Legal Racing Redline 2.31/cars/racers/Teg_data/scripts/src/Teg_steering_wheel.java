package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_steering_wheel extends SteeringWheel
{
	public Teg_steering_wheel( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Teg steering wheel";
		description = "Stock 38.0 cm (15.0 inch) steering wheel for Teg models.";

		diameter = 380.0;
		value = tHUF2USD(26.586);
		brand_new_prestige_value = 24.59;
	}
}
