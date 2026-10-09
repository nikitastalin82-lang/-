package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;
import java.game.parts.enginepart.*;


public class Whisper_R_ram_air_intake extends AirCooler//Quarterpanel
{
	public Whisper_R_ram_air_intake( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper right ram air intake";

		description = "Stock RAM air intake system for Whisper models.";

		mincooling = 20.0;
		maxcooling = 100.0;
		airflowspeed = 1.0;

		value = tHUF2USD(109.931);
		brand_new_prestige_value = 32.89;
		setMaxWear(kmToMaxWear(285000));
		calcAirCooling();
	}
}