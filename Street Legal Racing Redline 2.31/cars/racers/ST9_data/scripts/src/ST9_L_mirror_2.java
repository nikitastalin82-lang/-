package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_L_mirror_2 extends Mirror
{
	public ST9_L_mirror_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 custom left mirror";
		description = "Custom left mirror for ST9 models.";

		value = tHUF2USD(74.061);
		brand_new_prestige_value = 37.21;
	}
}
