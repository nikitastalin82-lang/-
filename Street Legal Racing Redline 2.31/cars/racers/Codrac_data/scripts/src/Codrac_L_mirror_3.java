package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_L_mirror_3 extends Mirror
{
	public Codrac_L_mirror_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac tuner left mirror";
		description = "Stylized left mirror for Codrac models.";

		value = tHUF2USD(106.766);
		brand_new_prestige_value = 31.50;
	}
}
