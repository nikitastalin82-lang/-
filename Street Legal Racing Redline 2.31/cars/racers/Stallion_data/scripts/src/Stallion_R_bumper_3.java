package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_R_bumper_3 extends Bumper
{
	public Stallion_R_bumper_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion tuner rear bumper";
		description = "Stylized rear bumper for Stallion models.";

		value = tHUF2USD(238.641);
		brand_new_prestige_value = 55.29;
	}
}
