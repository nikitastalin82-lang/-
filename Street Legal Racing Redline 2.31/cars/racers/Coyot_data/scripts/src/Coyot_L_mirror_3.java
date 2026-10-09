package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_L_mirror_3 extends Mirror
{
	public Coyot_L_mirror_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot tuner left mirror";
		description = "Stylized left mirror for Coyot models.";

		value = tHUF2USD(114.151);
		brand_new_prestige_value = 35.43;
	}
}
