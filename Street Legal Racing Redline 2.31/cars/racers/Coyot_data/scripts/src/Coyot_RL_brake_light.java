package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_RL_brake_light extends Taillights
{
	public Coyot_RL_brake_light( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot left brake light";
		description = "Stock left taillight component for Coyot models.";

		value = tHUF2USD(74.272);
		brand_new_prestige_value = 26.04;
	}
}
