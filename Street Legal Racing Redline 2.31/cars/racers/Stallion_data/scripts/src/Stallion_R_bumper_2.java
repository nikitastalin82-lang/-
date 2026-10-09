package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_R_bumper_2 extends Bumper
{
	public Stallion_R_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion custom bumper";
		description = "Custom rear bumper for Stallion models.";

		value = tHUF2USD(173.864);
		brand_new_prestige_value = 44.31;
	}
}
