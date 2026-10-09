package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_R_bumper_3 extends Bumper
{
	public Einvagen_R_bumper_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen 140 DTM rear bumper";
		description = "The rear bumper for Einvagen 140 DTM. Being based on rear bumper of 140GTA model, the DTM version became lighter and a bit more massive, it has also gained additional aerodynamics.";

		value = tHUF2USD(3209.31);
		brand_new_prestige_value = 64.00;
	}
}
