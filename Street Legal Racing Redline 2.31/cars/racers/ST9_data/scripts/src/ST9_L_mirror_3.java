package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_L_mirror_3 extends Mirror
{
	public ST9_L_mirror_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 tuner left mirror";
		description = "Stylized left mirror for ST9 models.";

		value = tHUF2USD(125.123);
		brand_new_prestige_value = 41.34;
	}
}
