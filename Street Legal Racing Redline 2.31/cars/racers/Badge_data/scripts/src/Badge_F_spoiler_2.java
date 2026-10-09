package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_F_spoiler_2 extends Splitter
{
	public Badge_F_spoiler_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge GTO front spoiler";
		description = "Stock front spoiler for the Badge GTO.";

		value = tHUF2USD(177.662);
		brand_new_prestige_value = 34.54;
	}
}
