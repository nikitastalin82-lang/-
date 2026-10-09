package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_L_mirror_3 extends Mirror
{
	public Teg_L_mirror_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg tuner left mirror";
		description = "Stylized left mirror for Teg models.";

		value = tHUF2USD(116.05);
		brand_new_prestige_value = 33.47;
	}
}
