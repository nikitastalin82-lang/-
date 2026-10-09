package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_steering_wheel extends SteeringWheel
{
	public Kurumma_steering_wheel( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Kurumma steering wheel";
		description = "Stock 38.0 cm (15.0 inch) steering wheel for Kurumma models.";

		diameter = 380.0;
		value = tHUF2USD(57.603);
		brand_new_prestige_value = 31.82;
	}
}
