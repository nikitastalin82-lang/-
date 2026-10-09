package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_F_spoiler extends Splitter
{
	public Badge_F_spoiler( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge '67 front spoiler";
		description = "Stock front spoiler for the Badge '67.";

		value = tHUF2USD(98.748);
		brand_new_prestige_value = 31.35;
	}
}
