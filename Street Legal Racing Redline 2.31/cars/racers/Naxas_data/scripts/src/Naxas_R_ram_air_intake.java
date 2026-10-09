package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;
import java.game.parts.enginepart.*;


public class Naxas_R_ram_air_intake extends AirCooler//Quarterpanel
{
	public Naxas_R_ram_air_intake( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas right ram air intake";

		description = "Stock RAM air intake system for Naxas models.";

		mincooling = 20.0;
		maxcooling = 100.0;
		airflowspeed = 1.0;

		value = tHUF2USD(85.033);
		brand_new_prestige_value = 30.54;
		setMaxWear(kmToMaxWear(285000));
		calcAirCooling();
	}
}