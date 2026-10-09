package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_L_mirror_2 extends Mirror
{
	public Badge_L_mirror_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge GTO left mirror";
		description = "Stock left mirror for Badge GTO models.";

		value = tHUF2USD(161.415);
		brand_new_prestige_value = 34.49;
	}
}
