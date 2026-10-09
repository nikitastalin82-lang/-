package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_R_mirror_2 extends Mirror
{
	public Badge_R_mirror_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge GTO right mirror";
		description = "Stock right mirror for the Badge GTO.";

		value = tHUF2USD(161.415);
		brand_new_prestige_value = 34.49;
	}
}
