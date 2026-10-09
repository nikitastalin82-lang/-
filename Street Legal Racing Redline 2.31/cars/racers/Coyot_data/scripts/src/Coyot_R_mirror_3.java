package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_R_mirror_3 extends Mirror
{
	public Coyot_R_mirror_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot tuner right mirror";
		description = "Stylized right mirror for Coyot models.";

		value = tHUF2USD(114.151);
		brand_new_prestige_value = 35.43;
	}
}
