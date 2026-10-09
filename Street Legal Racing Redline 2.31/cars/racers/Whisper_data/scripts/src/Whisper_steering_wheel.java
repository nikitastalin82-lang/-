package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_steering_wheel extends SteeringWheel
{
	public Whisper_steering_wheel( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Whisper steering wheel";
		description = "Stock 38.0 cm (15.0 inch) steering wheel for Whisper models.";

		diameter = 380.0;
		value = tHUF2USD(74.061);
		brand_new_prestige_value = 40.50;
	}
}
