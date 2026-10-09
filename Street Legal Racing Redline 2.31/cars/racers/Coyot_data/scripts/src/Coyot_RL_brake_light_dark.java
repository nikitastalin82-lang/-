package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_RL_brake_light_dark extends Taillights
{
	public Coyot_RL_brake_light_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot dark left brake light";
		description = "Dark left taillight component for Coyot models.";

		value = tHUF2USD(76.272);
		brand_new_prestige_value = 30.04;
	}
}
