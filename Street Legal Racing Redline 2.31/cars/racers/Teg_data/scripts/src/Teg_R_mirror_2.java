package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_R_mirror_2 extends Mirror
{
	public Teg_R_mirror_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg custom right mirror";
		description = "Custom right mirror for Teg models.";

		value = tHUF2USD(59.924);
		brand_new_prestige_value = 30.12;
	}
}
