package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_F_bumper_2 extends Bumper
{
	public Stallion_F_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion custom front bumper";
		description = "Custom front bumper for Stallion models.";

		value = tHUF2USD(201.294);
		brand_new_prestige_value = 44.31;
	}
}
