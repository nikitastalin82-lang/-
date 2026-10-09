package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_L_mirror extends Mirror
{
	public Teg_L_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg stock left mirror";
		description = "Stock left mirror for Teg models.";

		value = tHUF2USD(30.173);
		brand_new_prestige_value = 24.59;
	}
}
