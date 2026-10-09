package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;
import java.game.parts.enginepart.*;

public class Furrano_L_RAM_air_intake extends AirCooler//Quarterpanel
{
	public Furrano_L_RAM_air_intake( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano left RAM air intake";

		description = "Stock RAM air intake system for Furrano models.";

		mincooling = 20.0;
		maxcooling = 100.0;
		airflowspeed = 1.0;
		intercooling = 0.1;

		value = tHUF2USD(94.739);
		brand_new_prestige_value = 28.19;
		setMaxWear(kmToMaxWear(285000));
		calcAirCooling();
	}
}